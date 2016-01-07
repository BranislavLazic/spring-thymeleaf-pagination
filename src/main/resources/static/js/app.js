$(document).ready(function() {
	changePageSize();
});

function changePageSize() {
	$('#pageSizeSelect').change(function(evt) {
		window.location.replace("/?pageSize=" + this.value);
	});
}