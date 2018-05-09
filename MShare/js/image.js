function captureImage(uploadUrl) {
	var mobileCamera = plus.camera.getCamera();
	mobileCamera.captureImage(function(e) {
		plus.io.resolveLocalFileSystemURL(e, function(entry) {
			var path = entry.toLocalURL() + '?version=' + new Date().getTime();
			uploadImage(uploadUrl, path);
		}, function(err) {
			mui.toast('无法正常读取拍照文件');
		});
	}, function(e) {
		mui.toast('无法正常调用摄像头');
	}, function() {
		filename: '_doc/head.png';
	});
}

function chooseImage(uploadUrl) {
	plus.gallery.pick(function(a) {
		plus.io.resolveLocalFileSystemURL(a, function(entry) {
			plus.io.resolveLocalFileSystemURL('_doc/', function(root) {
				root.getFile('head.png', {}, function(file) {
					file.remove(function() {
						entry.copyTo(root, 'head.png', function(e) {
							var path = e.fullPath + '?version=' + new Date().getTime();
							uploadImage(uploadUrl, path);
						}, function(err) {
							console.log("copy image fail: ", err);
						});
					}, function(err) {
						console.log("删除图片失败：（" + JSON.stringify(err) + ")");
					});
				}, function(err) {
					entry.copyTo(root, 'head.png', function(e) {
						var path = e.fullPath + '?version=' + new Date().getTime();
						uploadImage(path);
					}, function(err) {
						console.log("上传图片失败：（" + JSON.stringify(err) + ")");
					});
				});
			}, function(e) {
				console.log("读取文件夹失败：（" + JSON.stringify(err) + ")");
			});
		});
	}, function(err) {
		console.log("读取拍照文件失败: ", err);
	}, {
		filter: 'image'
	});
};

function uploadImage(url, imgPath) {
	var wt = plus.nativeUI.showWaiting();
	var task = plus.uploader.createUpload(url, {
			method: "POST"
		},
		function(data, status) {
			if(status == 200) {
				wt.close();
				var mainImg = document.getElementById('head');
				mainImg.src = imgPath;
				plus.storage.setItem('headicon', imgPath);
				var homeView = plus.webview.getWebviewById('home');  
				mui.fire(homeView, 'update_headicon', {
					icon: imgPath
				});
			} else {
				mui.alert('头像更新失败', '提示');
				wt.close();
			}
		}
	);
	task.addFile(imgPath, {
		key: 'key'
	});
	task.addData('uid', plus.storage.getItem('uid'));
	task.start();

}

function getBase64Image(img) {
	var canvas = document.createElement("canvas");
	var width = img.width;
	var height = img.height;
	if(width > height) {
		if(width > 100) {
			height = Math.round(height *= 100 / width);
			width = 100;
		}
	} else {
		if(height > 100) {
			width = Math.round(width *= 100 / height);
		}
		height = 100;
	}

	canvas.width = width;
	canvas.height = height;
	var ctx = canvas.getContext('2d');
	ctx.drawImage(img, 0, 0, width, height);

	var dataUrl = canvas.toDataURL('image/png', 0.8);
	return dataUrl.replace('data:image/png:base64,', '');
}

function saveImageToGallery(imageData) {
	var bitmap = new plus.nativeObj.Bitmap("bitmap");
	bitmap.loadBase64Data(imageData, function() {
		bitmap.save('_doc/mshare_qrcode.png', {},
			function(i) {
				plus.gallery.save("_doc/mshare_qrcode.png", function() {
					mui.alert('已保存二维码图片到相册');
				});
			},
			function(e) {
				mui.alert('无法保存二维码图片到相册');
			});
	}, function() {
		mui.alert('无法读取二维码图片数据');
	});
}