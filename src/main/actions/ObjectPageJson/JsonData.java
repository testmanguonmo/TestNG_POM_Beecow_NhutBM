
package ObjectPageJson;

import com.beecow.actions.HomePage;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonData {
	@SerializedName("HomePage")
    @Expose
    private HomePage homePage;
	public HomePage getHomePage() {
        return homePage;
    }
	
    @SerializedName("ExpectedHomePage")
    @Expose
    private ExpectedHomePage expectedHomePage;

    public ExpectedHomePage expectedHomePage() {
        return expectedHomePage;
    }

    

    

}
