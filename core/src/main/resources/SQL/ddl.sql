
CREATE TABLE DIVER.PERSONA (
         nombre     VARCHAR2(100),
         apellido   VARCHAR2(150),
         email      VARCHAR2(100),
         edad       NUMBER);
COMMIT;

CREATE SEQUENCE sq_id_persona INCREMENT BY 1 START WITH 1;
COMMIT;