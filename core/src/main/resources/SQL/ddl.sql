
CREATE TABLE DIVER.PERSONA (
         id         NUMBER,
         nombre     VARCHAR2(100),
         apellido   VARCHAR2(150),
         email      VARCHAR2(100),
         edad       NUMBER);
COMMIT;

CREATE SEQUENCE DIVER.sq_id_persona INCREMENT BY 1 START WITH 1;
COMMIT;