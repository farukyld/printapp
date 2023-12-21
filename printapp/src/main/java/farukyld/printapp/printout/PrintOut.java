package farukyld.printapp.printout;

import java.time.LocalDateTime;


public class PrintOut {
  public String id;
  public DigitalDocument document;
  public PaperSize size;
  public int numCopies;
  public boolean useBothSides;
  public boolean colored;
  public boolean canPickItUp;
  public LocalDateTime dueDate;
  public int paymentTL;
  public UnseenPrintRequestNotification unseenReqNot;

  public PrintOut(String id, DigitalDocument document, PaperSize size, int numCopies, boolean useBothSides,
      boolean colored, boolean canPickItUp, LocalDateTime dueDate, int paymentTL,
      UnseenPrintRequestNotification unseenReqNot) {
    this.id = id;
    this.document = document;
    this.size = size;
    this.numCopies = numCopies;
    this.useBothSides = useBothSides;
    this.colored = colored;
    this.canPickItUp = canPickItUp;
    this.dueDate = dueDate;
    this.paymentTL = paymentTL;
    this.unseenReqNot = unseenReqNot;
  }

  public PrintOut() {
  }

  public static PrintOut example() {
    return new PrintOut("example-id", DigitalDocument.example(), PaperSize.DEF, 1, false, false, false,
        LocalDateTime.now().plusDays(2), 10, UnseenPrintRequestNotification.example());
  }

}

/**
 * notify the print requester if his request is not seen by any deliverer
 * until specified time.
 */
class UnseenPrintRequestNotification {

  /** enable notification */
  public boolean notify;
  /**
   * notification is send to print-requester
   * if request remains unseen by any delivererup to the specified time
   */
  public LocalDateTime requestUnseenUpto;

  public UnseenPrintRequestNotification(boolean notify, LocalDateTime requestUnseenUpto) {
    this.notify = notify;
    this.requestUnseenUpto = requestUnseenUpto;
  }

  public UnseenPrintRequestNotification() {
  }

  public static UnseenPrintRequestNotification example() {
    return new UnseenPrintRequestNotification(true, LocalDateTime.now().plusHours(3));
  }
}

enum PaperSize {
  A4,
  A5,
  A3,
  A2,
  A1;

  public static final PaperSize DEF = A4;

}

class DigitalDocument {
  public String id;
  public String referenceLink;
  
  public DigitalDocument() {
  }

  public DigitalDocument(String id, String referenceLink) {
    this.id = id;
    this.referenceLink = referenceLink;
  }

  public static DigitalDocument example() {
    return new DigitalDocument("example-document-id", "example-reference-link");
  }



}