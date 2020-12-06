/**
 * 
 */
function setCeroUnidades() {
	var bultos = document.getElementById("bultos").value;
	var fraccion = document.getElementById("fraccion").value;
	if (bultos > 0 || fraccion > 0)
		document.getElementById("unidades").value = '0';
}

function setCeroBultos() {
	var bultos = document.getElementById("unidades").value;
	if (bultos > 0) {
		document.getElementById("bultos").value = '0';
		document.getElementById("fraccion").value = '0';
	}
}