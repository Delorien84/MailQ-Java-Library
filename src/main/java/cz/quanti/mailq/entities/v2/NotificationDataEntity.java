package cz.quanti.mailq.entities.v2;


import java.time.LocalDateTime;
import java.util.*;

public class NotificationDataEntity extends BaseEntity{

    private String id;
    private String replyToEmail;
    private Map<String,Object> data = new HashMap<>();
    private List<NotificationAttachmentEntity> attachments;
    private LocalDateTime openedTimestamp;
    private LocalDateTime undeliveredTimestamp;
    private LocalDateTime unsubscribedTimestamp;

    private String recipientEmail;
    private Set<String> cc;
    private Set<String> bcc;
    private LocalDateTime dateFrom;

    public String getId() {
        return id;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public String getReplyToEmail() {
        return replyToEmail;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public List<NotificationAttachmentEntity> getAttachments() {
        return attachments;
    }

    public LocalDateTime getOpenedTimestamp() {
        return openedTimestamp;
    }

    public LocalDateTime getUndeliveredTimestamp() {
        return undeliveredTimestamp;
    }

    public LocalDateTime getUnsubscribedTimestamp() {
        return unsubscribedTimestamp;
    }

    public NotificationDataEntity setReplyToEmail(String replyToEmail) {
        this.replyToEmail = replyToEmail;
        return this;
    }

    public NotificationDataEntity setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public NotificationDataEntity setAttachments(List<NotificationAttachmentEntity> attachments) {
        this.attachments = attachments;
        return this;
    }

    public NotificationDataEntity setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
        return this;
    }

    public NotificationDataEntity setCc(Set<String> cc) {
        this.cc = cc;
        return this;
    }

    public NotificationDataEntity setCc(String... cc) {
        return this.setCc(new HashSet<>(Arrays.asList(cc)));
    }

    public NotificationDataEntity setBcc(Set<String> bcc) {
        this.bcc = bcc;
        return this;
    }

    public NotificationDataEntity setBcc(String... bcc) {
        return this.setBcc(new HashSet<>(Arrays.asList(bcc)));
    }

    public NotificationDataEntity setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }
}
