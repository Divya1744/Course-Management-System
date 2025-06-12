function fetch_courses()
{
    
    fetch("http://localhost:8080/courses")
    .then((response)=>response.json())
    .then((data)=>{
        const dataTable = document.getElementById("course-list");
        data.forEach(course => {
            let row = `<tr>
            <td>${course.course_id}</td>
            <td>${course.name}</td>
            <td>${course.duration_in_weeks}</td>
            <td>${course.trainer}</td>
            </tr>`
            dataTable.innerHTML += row;
        });
    })
}