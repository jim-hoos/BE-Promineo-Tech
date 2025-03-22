CREATE TABLE project (
  project_id int NOT NULL AUTO_INCREMENT,
  project_name varchar(50) DEFAULT NULL,
  estimated_hours int DEFAULT NULL,
  actual_hours int DEFAULT NULL,
  difficulty varchar(45) DEFAULT NULL,
  notes varchar(500) DEFAULT NULL,
  PRIMARY KEY (project_id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO projects.project
(project_id,
project_name,
estimated_hours,
actual_hours,
difficulty,
notes)
VALUES
(1,
'Test',
100,
40,
'Easy',
'Initial test');

