package Structural.ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements ServiceInterface {

    private Service realService;
    private List<Person> authorizedPeople;

    public Proxy(Service realService) {
        this.realService = realService;
        this.authorizedPeople = new ArrayList<>();
    }

    public boolean checkAccess(Person person) {
        return authorizedPeople.contains(person);
    }

    public void authorize(Person person) {
        if (!checkAccess(person)) authorizedPeople.add(person);
    }

    public void unAuthorize(Person person) {
        if (checkAccess(person)) authorizedPeople.remove(person);
    }

    @Override
    public void operation(Person person, String query) {
        if (checkAccess(person)) realService.operation(person, query);
    }

    public Service getRealService() {
        return realService;
    }

    public void setRealService(Service realService) {
        this.realService = realService;
    }

    public List<Person> getAuthorizedPeople() {
        return authorizedPeople;
    }

    public void setAuthorizedPeople(List<Person> authorizedPeople) {
        this.authorizedPeople = authorizedPeople;
    }
}
