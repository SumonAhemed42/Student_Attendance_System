# Student Attendance System

A Java-based Student Attendance System designed for schools, colleges, and universities. The system uses Java Swing for the GUI and MySQL for database management to simplify the process of recording, storing, and reporting student attendance.

## Features

- **Automated Attendance Recording**: Teachers can mark student attendance and the system will automatically store the records.
- **Efficient Data Management**: Store attendance data for each class, and retrieve student attendance easily.
- **Report Generation**: Automatically generates detailed reports of attendance.
- **Security**: Ensures the safety of student data with secure database connectivity.
- **User-friendly Interface**: Built with Java Swing, providing an intuitive and easy-to-use interface for teachers and students.

## Technologies Used

- **Java**: Core programming language used for the backend logic.
- **Java Swing**: GUI toolkit used for building the desktop interface.
- **MySQL**: Database management system for storing attendance records.
- **NetBeans**: IDE used for development.
- **XAMPP**: Used for local server setup to run MySQL.

## Installation

### Prerequisites

- [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your system.
- [NetBeans](https://netbeans.apache.org/) for development and running the project.
- [XAMPP](https://www.apachefriends.org/index.html) for running MySQL server.

### Setup Instructions

1. Clone this repository:

    ```bash
    git clone https://github.com/yourusername/student-attendance-system.git
    ```

2. Set up MySQL using XAMPP or your preferred MySQL server.
   - Create a new database named `attendance_system`.
   - Import the provided `.sql` file to create the necessary tables.

3. Open the project in NetBeans and run the `StudentAttendanceSystem` class.

4. The application should launch, and you will be able to start recording and generating attendance reports.

## Usage

1. **Login**: Teachers and staff log in using the provided credentials.
2. **Mark Attendance**: Choose a class and mark students as present or absent.
3. **View Reports**: Generate attendance reports for specific periods.
4. **Security**: Ensure that all data entered is handled with proper security measures.

## Risk Analysis

- **Privacy and Security**: Sensitive student data is stored securely with encryption.
- **Technical Risks**: Regular maintenance and support ensure the system runs smoothly.
- **Operational Risks**: Staff training is provided to avoid disruptions in normal operations.

## Contributing

1. Fork this repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

- Thanks to the developers of Java, MySQL, NetBeans, and XAMPP for providing the tools to make this project possible.
