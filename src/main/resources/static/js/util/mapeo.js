$("#ck").change(function() {
	if ($(this).is(":checked")) {
		$("#fondo").prop("disabled", false);
		$("#nivel").prop("disabled", false);
		$("#posicion").prop("disabled", false);
		$("#pasillo").prop("disabled", false);
		$("#alias").prop("disabled", true);

	} else {
		$("#fondo").prop("disabled", true);
		$("#nivel").prop("disabled", true);
		$("#posicion").prop("disabled", true);
		$("#pasillo").prop("disabled", true);
		$("#alias").prop("disabled", false);
	}
});

document.getElementById("ck").onclick = function() {
	checkedFunction()
};

function checkedFunction() {
	$("#ck").change(function() {
		if ($(this).is(":checked")) {
			$("#tipo").prop("value", "rack");
		} else {
			$("#tipo").prop("value", "piso");
		}
	});
}