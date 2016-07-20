CREATE TABLE Artist(
	artist_id INT PRIMARY KEY,
	name VARCHAR(30),
	origin VARCHAR(50),
	launchDate DATE	
)

CREATE TABLE Album(
	album_id INT PRIMARY KEY,
	title VARCHAR(30),
	details TEXT,
	releaseDate DATE,
	artist_id VARCHAR(30)
)

CREATE TABLE Gender(
	name VARCHAR(20),
	description TEXT,
	artistOrigin VARCHAR(20),
	firstAppearedIn DATE
)

DROP TABLE Artist;
CREATE TABLE Artist(
	artist_id INT PRIMARY KEY,
	name VARCHAR(30),
	origin VARCHAR(50),
	launchDate DATE	
);

DROP TABLE Album;
CREATE TABLE Album(
	album_id INT PRIMARY KEY,
	title VARCHAR(30),
	details TEXT,
	releaseDate DATE,
	artist_id INT 
);

DROP TABLE Gender;
CREATE TABLE Gender(
	name VARCHAR(20),
	description TEXT,
	artistOrigin VARCHAR(20),
	firstAppearedIn DATE
);

INSERT INTO public.artist(
	artist_id, name, origin, launchdate)
	VALUES (1, 'Adele','London', TO_DATE('2006','YYYY');
INSERT INTO public.artist(
	artist_id, name, origin, launchdate) 
            VAlUES(2,'Beyonce', 'Texas', TO_DATE('2001', 'YYYY'));   
INSERT INTO public.artist(
	artist_id, name, origin, launchdate) 
            VAlUES(3,'SIA', 'Australia', TO_DATE('1997', 'YYYY'));
INSERT INTO public.artist(
	artist_id, name, origin, launchdate) 
            VAlUES(4,'Coldplay', 'London', TO_DATE('2000', 'YYYY'));  
INSERT INTO public.artist(
	artist_id, name, origin, launchdate) 
            VAlUES(5,'Prince', 'Minneapolis', TO_DATE('1980', 'YYYY')); 
			
			
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (1, '19', '', TO_DATE('2008','YYYY'), 1);
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (2, '21', '', TO_DATE('2011','YYYY'), 1);
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (3, '25', '', TO_DATE('2015','YYYY'), 1);
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (4, 'Dangerous in love','' ,TO_DATE('2003/06/23','YYYY/MM/DD'), 2);
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (5, 'BDay', '', TO_DATE('2006-08-31','YYYY-MM-DD'), 2);
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (6, 'I Am... Sasha Fierce', '', TO_DATE('2008-11-14','YYYY-MM-DD'), 2);
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (7, '4', '', TO_DATE('2011-06-24','YYYY-MM-DD'), 2);
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (8, 'Beyonce', '', TO_DATE('2013-12-13','YYYY-MM-DD'), 2);
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (9, 'OnlySee', '', TO_DATE('1997-01-01','YYYY-MM-DD'), 3);           
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (10, 'Healing is Difficult', '', TO_DATE('2001-07-9','YYYY-MM-DD'), 4);               
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (11, 'Parachutes', '', TO_DATE('2000-07-10','YYYY-MM-DD'), 4);      
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (12, 'A Rush of Blood to the Head', '', TO_DATE('2002-08-26','YYYY-MM-DD'), 4);       
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (13, 'Ghost Stories', '', TO_DATE('2014-05-19','YYYY-MM-DD'), 4);    
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (14, 'For You', '', TO_DATE('1978-04-07','YYYY-MM-DD'), 5);    
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (15, 'Prince', '', TO_DATE('1979-10-19','YYYY-MM-DD'), 5);    
INSERT INTO public.album(
	album_id, title, details, releasedate, artist_id)
	VALUES (16, 'Dirty Mind', '', TO_DATE('1980-10-08','YYYY-MM-DD'), 5);        

INSERT INTO public.gender(
	name, description, artistorigin, firstappearedin, gender_id)
	VALUES ('soul','', 'Solomon Burke', TO_DATE('1950', 'YYYY'), 1);
INSERT INTO public.gender(
	name, description, artistorigin, firstappearedin, gender_id)
	VALUES ('jazz','', 'Louis Armstrong', TO_DATE('1980', 'YYYY') , 2);
INSERT INTO public.gender(
	name, description, artistorigin, firstappearedin, gender_id)
	VALUES ('blues','', 'B.B.King',  TO_DATE('1990', 'YYYY'), 3);  
INSERT INTO public.gender(
	name, description, artistorigin, firstappearedin, gender_id)
	VALUES ('r&b','', '',  TO_DATE('1940', 'YYYY'), 4);
INSERT INTO public.gender(
	name, description, artistorigin, firstappearedin, gender_id)
	VALUES ('pop','', '',  TO_DATE('1950', 'YYYY'), 5);
INSERT INTO public.gender(
	name, description, artistorigin, firstappearedin, gender_id)
	VALUES ('hip hop','', '',  TO_DATE('1970', 'YYYY'), 6);
INSERT INTO public.gender(
	name, description, artistorigin, firstappearedin, gender_id)
	VALUES ('rock','', '',  TO_DATE('1950', 'YYYY'), 7);
INSERT INTO public.gender(
	name, description, artistorigin, firstappearedin, gender_id)
	VALUES ('classical','', '',  TO_DATE('1730', 'YYYY'), 8);	
	
	
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (1, 1);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (1, 2);
 INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (1, 4);   
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (1, 5);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (2, 5);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (2, 6);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (2, 7);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (3, 2);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (3, 3);    
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (3, 7);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (3, 8); 
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (4, 1);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (4, 3);    
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (4, 4);    
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (5, 1);    
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (5, 2);
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (5, 7);    
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (5, 8);    
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (5, 3);    
INSERT INTO public."ArtistGender"(
	artist_id, gender_id)
	VALUES (5, 4);    
insert into public."ArtistGender" values(4,2);
    	
	
b. 
select a.name from public."artist" a join public."ArtistGender" g
	on a.artist_id=g.artist_id join public."gender" gg on g.gender_id=gg.gender_id 
    	where extract(year from a.launchdate) > 2000 and gg.name = 'jazz'; 
		
c.
select count(distinct a.name) from public."artist" a join public."ArtistGender" g
	on a.artist_id=g.artist_id join public."gender" gg on g.gender_id=gg.gender_id 
    	where gg.name = 'jazz'; 
d.
select count(g.title) as cnt, a.name from public."artist" a join public."album" g
	on a.artist_id = g.artist_id group by g.artist_id,a.name having count(g.title) > 2; 		

e. 
select * from public."artist" b join public."album" a on b.artist_id = a.artist_id join public."ArtistGender" g
	on a.artist_id=g.artist_id join public."gender" gg on g.gender_id=gg.gender_id;
	
f.
select a.title from public."artist" b join public."album" a on b.artist_id = a.artist_id join public."ArtistGender" g
	on a.artist_id=g.artist_id join public."gender" gg on g.gender_id=gg.gender_id where gg.name = 'hip hop' order by releasedate;

g.
select distinct a.name from public."artist" a join public."ArtistGender" g
	on a.artist_id=g.artist_id join public."gender" gg on g.gender_id=gg.gender_id 
    	where gg.name = 'hip hop' OR gg.name = 'rock'; 	

h.
(select a.name from public."artist" a join public."ArtistGender" g
	on a.artist_id=g.artist_id join public."gender" gg on g.gender_id=gg.gender_id 
    	where gg.name = 'hip hop' order by a.launchdate) UNION (select a.name from public."artist" a join public."ArtistGender" g
	on a.artist_id=g.artist_id join public."gender" gg on g.gender_id=gg.gender_id 
    	where gg.name = 'rock' order by a.launchdate); 

i. 
ALTER TABLE "album"
ADD likes integer;

j.
update album set likes = floor(random() * (20 + 1));

k.
select a.name, sum(g.likes) as ss from public."artist" a join public."album" g
	on a.artist_id = g.artist_id group by g.artist_id,a.name order by ss DESC; 

l.

	
m.
select distinct a.name from public."artist" a join public."ArtistGender" g
	on a.artist_id=g.artist_id join public."gender" gg on g.gender_id=gg.gender_id 
    	where gg.name in ('rock', 'hip hop', 'jazz', 'classical');    	 
	