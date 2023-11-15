//USER1 AJAX
			$(function(){
				//User1
				$('#btnUser1s').click(function(){
					$.ajax({
						type:'GET',
						url: '/Ch10/user1',
						dataType : 'json',
						success:function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser1s end
				
				$('#btnUser1').click(function(){
					$.ajax({
						type:'GET',
						url: '/Ch10/user1/A102',
						dataType : 'json',
						success:function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser1 end
				
				$('#btnUser1Register').click(function(){
					const jsonData ={
						id:'s101',
						name: '홍길동',
						hp: '010-1111-1001',
						age: 22
					};
					
					$.ajax({
						type: 'POST',
						url: '/Ch10/user1',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser1Register end
				
				$('#btnUser1Modify').click(function(){
					const jsonData ={
						id:'s101',
						name: '홍길동',
						hp: '010-2222-1001',
						age: 23
					};
					
					$.ajax({
						type:'PUT',
						url: '/Ch10/user1',
						data: jsonData,
						dataType : 'json',
						success:function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser1Modify end
				
				$('#btnUser1Delete').click(function(){
					$.ajax({
						type:'DELETE',
						url: '/Ch10/user1/s101',
						dataType : 'json',
						success:function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser1Delete end
			});// onload end
