/**
 * 
 */
function setCeroUnidades() {
	var bultos = document.getElementById("bultos").value;
	if (bultos > 0)
		document.getElementById("relleno").value = '0';
}

function setCeroBultos() {
	var bultos = document.getElementById("relleno").value;
	if (bultos > 0)
		document.getElementById("bultos").value = '0';
}