CREATE TABLE mahasiswa (
	nrp int NOT NULL PRIMARY KEY,
	nama varchar(255),
	npp int,
	CONSTRAINT FK_dosen_mahasiswa
	FOREIGN KEY (npp) REFERENCES
	dosen (npp)
)