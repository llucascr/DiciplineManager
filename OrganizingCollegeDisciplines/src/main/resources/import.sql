INSERT INTO tb_student (birthday_date, email, name, course) VALUES ('2000-05-15', 'john.doe@example.com', 'John Doe', 'Engenharia de Software');
INSERT INTO tb_student (birthday_date, email, name, course) VALUES ('1999-12-03', 'jane.smith@example.com', 'Jane Smith', 'Ciência da Computação');
INSERT INTO tb_student (birthday_date, email, name, course) VALUES ('2001-07-20', 'emily.jones@example.com', 'Emily Jones', 'Sistemas de Informação');
INSERT INTO tb_student (birthday_date, email, name, course) VALUES ('1998-09-10', 'michael.brown@example.com', 'Michael Brown', 'Engenharia de Computação');
INSERT INTO tb_student (birthday_date, email, name, course) VALUES ('2002-01-25', 'sarah.davis@example.com', 'Sarah Davis', 'Tecnologia da Informação');

INSERT INTO tb_dicipline (status, duration, name) VALUES ('cursando', '60h', 'Matemática Aplicada');
INSERT INTO tb_dicipline (status, duration, name) VALUES ('cursado', '45h', 'Introdução à Programação');
INSERT INTO tb_dicipline (status, duration, name) VALUES ('cursando', '30h', 'Banco de Dados');
INSERT INTO tb_dicipline (status, duration, name) VALUES ('cursado', '90h', 'Engenharia de Requisitos');
INSERT INTO tb_dicipline (status, duration, name) VALUES ('cursando', '120h', 'Estrutura de Dados');
INSERT INTO tb_dicipline (status, duration, name) VALUES ('ainda não cursado', '75h', 'Inteligência Artificial');
INSERT INTO tb_dicipline (status, duration, name) VALUES ('ainda não cursado', '50h', 'Segurança da Informação');
INSERT INTO tb_dicipline (status, duration, name) VALUES ('ainda não cursado', '40h', 'Desenvolvimento Web');

INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (8.5, 0.6, 9.0, 7.5, 1, 1);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (7.0, 0.5, 6.5, 8.0, 2, 1);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (9.3, 0.7, 9.5, 9.0, 3, 2);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (6.8, 0.4, 7.0, 6.5, 4, 2);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (8.0, 0.6, 8.2, 7.8, 5, 3);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (7.5, 0.5, 8.0, 7.0, 6, 3);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (9.0, 0.8, 9.5, 8.5, 7, 4);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (6.5, 0.4, 7.0, 6.0, 8, 4);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (8.7, 0.6, 9.0, 8.0, 1, 5);
INSERT INTO tb_record (final_grade, note_weight, test_grade, work_grade, dicipline_id, student_id) VALUES (7.2, 0.5, 7.5, 7.0, 2, 5);
