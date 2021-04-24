create table My_Bank (
	uuid_ VARCHAR(75) null,
	Bank_id LONG not null primary key,
	BankName VARCHAR(75) null,
	Bic LONG,
	Address VARCHAR(75) null,
	isArchive INTEGER
);

create table My_Employee (
	uuid_ VARCHAR(75) null,
	Prson_id LONG not null primary key,
	LastName VARCHAR(75) null,
	FirstName VARCHAR(75) null,
	Patronymic VARCHAR(75) null,
	Date_of_birth DATE null,
	Date_of_start_work DATE null,
	WorkNumber LONG,
	Position_Id LONG,
	HomeNumber LONG,
	Bank_id LONG,
	IsArchive LONG
);

create table My_Positions (
	uuid_ VARCHAR(75) null,
	Positions_id LONG not null primary key,
	Position_name VARCHAR(75) null,
	is_Archive LONG,
	Salary LONG
);