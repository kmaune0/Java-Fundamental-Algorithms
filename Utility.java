// Utility.java
// (C) 2014 Kyle Maune

// import your own packages
// basic outline for personal practice

public class Utility {

  protected String authToken;

    public Utility(String authToken) {
      this.authToken = authToken;
    }

    @Deprecated
    public Utility(String authToken, String accountSide) {
      this.authToken = authToken;
    }

    public boolean validateRequest(String expectedSignature, String url, Map<String,String> params) {
      String signature = null;

      signature = getValidationSignature(url, params);

      if (signature == null) {
            return false;
      } else {
              return signature.equals(expectedSignature);
      }
    }
}
