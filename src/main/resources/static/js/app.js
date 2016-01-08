$(document).ready(function() {
	changePageAndSize();
});

function changePageAndSize() {
	$('#pageSizeSelect').change(function(evt) {
		window.location.replace("/?pageSize=" + this.value);
	});

	$('.pageLink').click(function(evt) {
		var selectedPageSize = $('#pageSizeSelect').val();
		this.href = this.href.replace("?page=", '?pageSize=' + selectedPageSize + '&page=');

	});
}
