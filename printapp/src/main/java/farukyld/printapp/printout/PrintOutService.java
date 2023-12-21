package farukyld.printapp.printout;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PrintOutService {
  public List<PrintOut> getPrintOuts() {
    return List.of(
        PrintOut.example());
  }
}
