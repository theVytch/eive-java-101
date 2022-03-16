package br.com.m11h.feedbox;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Feedback {

    private LocalDateTime createAt;
    private LocalDateTime sentAt;
    private Collaborator from;
    private Collaborator to;
    private String content;
    private Boolean isRead;

    public Feedback(Collaborator from, Collaborator to, String content) {
        this.createAt = LocalDateTime.now();
        this.sentAt = LocalDateTime.now();
        this.from = from;
        this.to = to;
        this.content = content;
        markAsRead();
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public Collaborator getFrom() {
        return from;
    }

    public void setFrom(Collaborator from) {
        this.from = from;
    }

    public Collaborator getTo() {
        return to;
    }

    public void setTo(Collaborator to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    public void markAsRead(){
        setRead(true);
    }

    @Override
    public String toString() {
        return "Feedback{" +"\n" +
                " createAt = " + createAt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
                ",\n sentAt = " + sentAt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
                ",\n from = " + from +
                ",\n to = " + to +
                ",\n content = '" + content + '\'' +
                ",\n isRead = " + isRead + "\n"+
                '}';
    }
}
