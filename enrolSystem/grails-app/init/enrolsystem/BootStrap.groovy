package com.enrol

class BootStrap {

    def init = { servletContext ->


def Lynne = new Lecturer(
fullName:'Lynne Dawson',
post:'Ms',
subject:'Computing',
lecturerEmail:'LDawson@gmail.com',
office:'9412',
bio:'I love computers').save()

def Peter = new Lecturer(
fullName:'Peter Onell',
post:'Mr',
subject:'Computing',
lecturerEmail:'Ponell@gmail.com',
office:'9413',
bio:'Coding is fun').save()

def Sean = new Lecturer(
fullName:'Sean Smith',
post:'Ms',
subject:'Geography',
lecturerEmail:'Ssmith@gmail.com',
office:'312',
bio:'Rivers are cool').save()

def Computing= new Course(
department:'Computing',
courseTitle:'BSc Hon Computing',
courseLeader:Lynne,
courseCode:'B800',
startDate:new Date('02/10/2019'),
endDate:new Date('10/05/2023'),
description:'Coding and Stuff',
numberOfStudents:'40',
tuitionFees:'9250').save()

def Geography= new Course(
department:'Geography',
courseTitle:'BSc Hon Geography',
courseLeader:Sean,
courseCode:'F810',
startDate:new Date('02/10/2019'),
endDate:new Date('10/05/2023'),
description:'Maps and rives',
numberOfStudents:'40',
tuitionFees:'9250').save()

def BioScience= new Course(
department:'Biomedical Science',
courseTitle:'BSc Hon Biomedical Science',
courseLeader:'Laura Cole',
courseCode:'F410',
startDate:new Date('02/10/2019'),
endDate:new Date('10/05/2024'),
description:'Plants and that',
numberOfStudents:'40',
tuitionFees:'6170').save()

def StudentBen= new Student(
studentName:'Ben Kata',
studentID:'ben',
dob:new Date('15/06/1999'),
isFundingAvailble:'True',
studentEmail:'bebeabe@vve.com',
studentUsername:'brbrb',
studentPassword:'vbrbdd',
course:Computing).save()

def StudentJames= new Student(
studentName:'James',
studentID:'james',
dob:new Date('05/03/1999'),
isFundingAvailble:'True',
studentEmail:'befrf@ve.com',
studentUsername:'brbded',
studentPassword:'vbrbdd',
course:Computing).save()

def Coding= new Module(
module_title:'Coding',
module_code:'one',
credits:50,
lecturer:'Peter',
course:'Computing',
description:'Coding and that').save()

def Systemarch = new Module(
module_title:'Systemarch',
module_code:'One',
credits:50,
lecturer:'Peter',
course:'Computing',
description:'Loving computing').save()

def DataWeb = new Module(
module_title:'Database&Web',
module_code:'Three',
credits:50,
lecturer:'Peter',
course:'Computing',
description:'Loving computing').save()

def Rivers = new Module(
module_title:'Water & Rivers',
module_code:'Six',
credits:65,
lecturer:'Jane',
course:'Geography',
description:'Rivers and fun').save()

Lynne.addToModules(Coding)
Lynne.addToModules(DataWeb)
Sean.addToModules(Rivers)
Geography.addToLecturers(Sean)
Computing.addToLecturers(Peter)
Computing.addToLecturers(Lynne)
Lynne.addToCourses(Computing)
Peter.addToCourses(Computing)
Sean.addToCourses(Geography)

Computing.addToModules(Systemarch)
Computing.addToModules(DataWeb)
Computing.addToModules(Coding)

Geography.addToModules(Rivers)

Computing.addToStudents(StudentBen)
Computing.addToStudents(StudentJames)




    }
    def destroy = {
    }
}
