package br.com.m11h.feedbox;

public class Collaborator {

    private String surname;
    private String user;

    public Collaborator(String surname, String user) {
        this.surname = surname;
        this.user = user;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Feedback sendFeedback(Collaborator to, String content){
        System.out.println(new Feedback(this, to, content));
        return new Feedback(this, to, content);
    }

    @Override
    public String toString() {
        return "Collaborator{" +
                "surname='" + surname + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
