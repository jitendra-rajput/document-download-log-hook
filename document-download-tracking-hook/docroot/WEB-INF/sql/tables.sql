create table dlrecordlog (
	logId LONG not null primary key,
	fileEntryId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	ipAddress VARCHAR(75) null,
	createDate DATE null
);