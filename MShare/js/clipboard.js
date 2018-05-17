function toClipboard(content) {
	if(mui.os.ios) {
		var UIPasteboard = plus.ios.importClass("UIPasteboard");
		var generalPasteboard = UIPasteboard.generalPasteboard();
		generalPasteboard.plusCallMethod({
			setValue: content,
			forPasteboardType: "public.utf8-plain-text"
		});
		generalPasteboard.plusCallMethod({
			valueForPasteboardType: "public.utf8-plain-text"
		});
	} else {
		var context = plus.android.importClass("android.content.Context");
		var main = plus.android.runtimeMainActivity();
		var clip = main.getSystemService(context.CLIPBOARD_SERVICE);
		plus.android.invoke(clip, "setText", content);
	}
}