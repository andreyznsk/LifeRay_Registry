create index IX_52794EF0 on My_Bank (BankName[$COLUMN_LENGTH:75$]);
create index IX_5E84AF1F on My_Bank (uuid_[$COLUMN_LENGTH:75$]);

create index IX_28EA2C01 on My_Employee (IsArchive);
create index IX_215B106D on My_Employee (uuid_[$COLUMN_LENGTH:75$]);

create index IX_167AFDDE on My_Positions (is_Archive);
create index IX_26977377 on My_Positions (uuid_[$COLUMN_LENGTH:75$]);