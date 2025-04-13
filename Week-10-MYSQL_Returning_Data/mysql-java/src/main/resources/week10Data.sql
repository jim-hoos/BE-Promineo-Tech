USE projects;
INSERT INTO category (category_name) VALUES ('Doors and Windows');
INSERT INTO category (category_name) VALUES ('Repairs');
INSERT INTO material (project_id, material_name, num_required, cost)
VALUES
(1, 'Door in frame', 1, 99.99);
INSERT INTO material (project_id, material_name, num_required, cost)
VALUES
(1, 'Package of door hangers from Home Depot', 1, 10.99);
INSERT INTO material (project_id, material_name, num_required, cost)
VALUES
(1, '2-inch screws', 20, 1.09);
INSERT INTO step (project_id, step_text, step_order)
VALUES
(1, 'Align hangers on opening side of door vertically on the wall', 1);
INSERT INTO step (project_id, step_text, step_order)
VALUES
(1, 'Screw door hangers on the top and bottom of each side of the door frame', 2);
INSERT INTO project_category (project_id, category_id)
VALUES
(1, 1);
INSERT INTO project_category (project_id, category_id)
VALUES
(1, 2);