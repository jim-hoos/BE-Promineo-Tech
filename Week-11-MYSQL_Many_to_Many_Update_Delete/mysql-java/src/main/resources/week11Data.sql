USE projects;
INSERT INTO project (project_name, estimated_hours, actual_hours, difficulty, notes)
VALUES
('Hang a door', 4.0, 3.0, 3, 'use the door hangs from the Home Depot');
INSERT INTO material (project_id, material_name, num_required, cost)
VALUES
(2, 'Door in frame', 1, 99.99);
INSERT INTO material (project_id, material_name, num_required, cost)
VALUES
(2, 'Package of door hangers from Home Depot', 1, 10.99);
INSERT INTO material (project_id, material_name, num_required, cost)
VALUES
(2, '2-inch screws', 20, 1.09);
INSERT INTO step (project_id, step_text, step_order)
VALUES
(2, 'Align hangers on opening side of door vertically on the wall', 1);
INSERT INTO step (project_id, step_text, step_order)
VALUES
(2, 'Screw door hangers on the top and bottom of each side of the door frame', 2);
INSERT INTO project_category (project_id, category_id)
VALUES
(2, 1);
INSERT INTO project_category (project_id, category_id)
VALUES
(2, 2);