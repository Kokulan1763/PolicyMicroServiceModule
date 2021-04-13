
insert into policy values(1,1,101,50000.00,3);
insert into policy values(2,1,102,20000.00,5);
insert into policy values(3,1,103,20000.00,5);


insert into member_policy values(1,1,100000.00,1,101,'2020-03-15',3);
insert into member_policy values(2,1,120000.00,1,101,'2019-04-18',3);
insert into member_policy values(3,2,80000.00,2,102,'2019-05-10',5);


insert into provider_policy values(1,'MG Road', 'Apollo Hospital', 'Kolkata', 1);
insert into provider_policy values(2,'GachiBowli','Global Hospital', 'Hyderabad',1);
insert into provider_policy values(3,'Avadi Road', 'LifeLine','Chennai', 3);
insert into provider_policy values(4,'Bellary Road','Manipal Hospital','Bangalore',2);


insert into benefits values(1,'Medical check up');
insert into benefits values(2,'Accidental');
insert into benefits values(3,'Operations');