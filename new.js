function Faculty() {
    const faculties = [
        { id: 1, name: "Prof. Arjun Bala", department: "Computer Science", avatar: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/15---28-04-2023-02-07-35.jpg" },
        { id: 2, name: "Prof. Pradyuman Jadeja", department: "Mathematics", avatar: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/6---28-04-2023-02-06-07.jpg" },
        { id: 3, name: "Prof. Firoz Sherasiya", department: "Physics", avatar: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/12---28-04-2023-02-06-51.jpg" },
        { id: 4, name: "Prof. Krunal Vyas", department: "Chemistry", avatar: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/290---28-04-2023-02-09-16.jpg" }
    ];

    return (
        <div style={{
            display: "grid",
            gridTemplateColumns: "repeat(auto-fit, minmax(250px, 1fr))",
            gap: "20px",
            padding: "20px"
        }}>
            {faculties.map((fac) => (
                <div className="card" style={{ width: "100%" }}>
                    <img src={fac.avatar} className="card-img-top" alt={fac.name} style={{ height: "250px", objectFit: "cover" }} />
                    <div className="card-body">
                        <h5 className="card-title">Name : {fac.name}</h5>
                        <p className="card-text">department : {fac.department}</p>
                    </div>
                </div>
            ))}
        </div>
    );
}

export default Faculty;