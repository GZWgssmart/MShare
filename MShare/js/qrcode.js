var scan = null;

function scanQrcode() {
	initQrcode();
	flashLight();
	startScan();
}

function initQrcode() {
	var filters;
	var styles = {
		frameColor: "#0E76E1",
		scanbarColor: "#0E76E1",
		background: ""
	}
	scan = new plus.barcode.Barcode('qrcode-scan', filters, styles);
	scan.onmarked = onmarked;
	scan.onerror = onerror;
}

function flashLight() {
	var flag = false;
	var flashLight = document.getElementById("flash-light");
	flashLight.addEventListener('tap', function() {
		if(flag == false) {
			scan.setFlash(true);
			flag = true;
			flashLight.setAttribute("class", "mui-icon iconfont icon-shanguangdengdakai mui-pull-right qrcode-flash");
		} else {
			scan.setFlash(false);
			flag = false;
			flashLight.setAttribute("class", "mui-icon iconfont icon-shanguangdengguanbi mui-pull-right qrcode-flash");
		}
	});
}

function startScan() {
	scan.start();
};

function onerror(e) {
	mui.alert('无法正常开启二维码扫描');
};

function onmarked(type, result) {
	var text = '';
	switch(type) {
		case plus.barcode.QR:
			text = 'QR: ';
			break;
		case plus.barcode.EAN13:
			text = 'EAN13: ';
			break;
		case plus.barcode.EAN8:
			text = 'EAN8: ';
			break;
	}
	if (result) {
		result = result.replace(/\n/g, '');
		mui.openWindow({
			url: 'qrcode_result.html',
			extras: {
				qrcode_result: result
			},
			show: {
				aniShow: 'pop-in'
			},
			waiting: {
				autoShow: true
			}
		});
	}
};

function scanPicture() {
	plus.gallery.pick(function(path) {
		plus.barcode.scan(path, onmarked, function(error) {
			plus.nativeUI.alert('无法识别此图片');
		});
	}, function(err) {
		plus.nativeUI.alert('未选择本地相册的二维码');
	});
}

function fitPosition(scannerId) {
	var height = window.innerHeight + 'px';
	var width = window.innerWidth + 'px';
	var scanner = document.getElementById(scannerId);
	scanner.style.height = height;
	scanner.style.width = width;
	scanner.style.position = "absolute";
	scanner.style.top = "45px";
	scanner.style.left = "-250px";
}