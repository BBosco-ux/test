//Create Job Interface which have salary, startShift, endShift, printJobDescription, printWorkers, hirePerson, firePerson functions.
////Create OfficeJob abstract class implement Job
////implement necessarry functions from interface and create required fields
////Create OutsideJob abstract class implement Job
////implement necessarry functions from interface and create required fields
////Create Person class without inheriting anything and have basic peson information(then you will store person list in the abstract classes)
////Create SoftwareEngineer extends OfficeJob
////implement necessarry functions from abstract class and create required fields
////Create TaxiDriver extends OutsideJob
////implement necessarry functions from abstract class and create required fields
////Write your main class to have 1 SoftwareEngineer job and 1 TaxiDriver  job
////also create 10 people and assign these people to jobs.


public interface Job {
    double salary();
    String startShift();
    String endShift();
    void printJobDescription();
    void printWorkers();
    void hirePerson();
    void firePerson();

}
