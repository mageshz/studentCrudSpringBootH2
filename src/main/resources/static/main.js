/**
 * 
 */

$('document').ready(function(){
	$('.table .btn-warning').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		
		$.get(href,function(student,status){
			$('#idEdit').val(student.id);
			$('#nameEdit').val(student.name);
			$('#departmentEdit').val(student.department);
			$('#updatedByEdit').val(student.updatedBy);
			$('#updateOnEdit').val(student.updateOn.substr(0,10));
		});
		
		$('#editModal').modal();
	});
	
	
	
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		$('#deleteModal #delRef').attr('hr ef',href);
		$("#deleteModal").modal();
		
	});
	
	
	
});