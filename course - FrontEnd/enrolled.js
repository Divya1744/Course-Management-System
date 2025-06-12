function fetch_enrolled_students(){
    
    fetch("http://localhost:8080/courses/enrolled")
    .then((response)=>response.json())
    .then((data)=>{
        const dataTable = document.getElementById("enrolled-list");
        data.forEach(enroll => {
            var row = `<tr>
            <td>${enroll.id}</td>
            <td>${enroll.name}</td>
            <td>${enroll.emailId}</td>
            <td>${enroll.courseName}</td>
            </tr>`;
            dataTable.innerHTML += row;
        });
        
    })
        }