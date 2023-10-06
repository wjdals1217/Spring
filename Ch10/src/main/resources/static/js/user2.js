//USER2 AJAX
			$(function(){
				//User2
				$('#btnUser2s').click(function(){
					$.ajax({
						type:'GET',
						url: '/Ch10/user2',
						dataType : 'json',
						success:function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser2s end
				
				$('#btnUser2').click(function(){
					$.ajax({
						type:'GET',
						url: '/Ch10/user2/A101',
						dataType : 'json',
						success:function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser2 end
				
				$('#btnUser2Register').click(function(){
					const jsonData ={
						id:'A101',
						name: '김춘추',
						hp: '010-1234-1001',
						age: 23
						
					};
					
					$.ajax({
						type: 'POST',
						url: '/Ch10/user2',
						data: jsonData,
						dataType: 'json',
						success: function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser2Register end
				
				$('#btnUser2Modify').click(function(){
					const jsonData ={
						id:'s101',
						name: '홍길동',
						hp: '010-2222-1001',
						age: 23
					};
					
					$.ajax({
						type:'PUT',
						url: '/Ch10/user2',
						data: jsonData,
						dataType : 'json',
						success:function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser2Modify end
				
				$('#btnUser2Delete').click(function(){
					$.ajax({
						type:'DELETE',
						url: '/Ch10/user2/s101',
						dataType : 'json',
						success:function(data){
							console.log(data);
						}
					});//ajax end
				});//btnUser2Delete end
			});// onload end
