package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

import java.util.Iterator;
import java.util.Set;

public class AmazonSteps extends CommonMethods {

    @When("user opens browser and navigates to amazon and user clicks on All menu and clicks TV, Appliances, Electronics")
    public void user_opens_browser_and_navigates_to_amazon_and_user_clicks_on_all_menu_and_clicks_tv_appliances_electronics() {
        click(main.AllBtn);
        click(main.TvApplianceElectronicsBtn);
    }
    @Then("user clicks on Television under Tv, Audio, & Cameras")
    public void user_clicks_on_television_under_tv_audio_cameras() {
        click(main.TelevisionBtn);
    }
    @Then("user filters the results by Brand Samsung and sorts results with price High to Low")
    public void user_filters_the_results_by_brand_samsung_and_sorts_results_with_price_high_to_low() {
        click(TV.SamsungBtn);
        click(TV.FeaturedBtn);
        click(TV.HighToLowBtn);
    }
    @Then("user clicks on second highest priced item")
    public void user_clicks_on_second_highest_priced_item() {
        click(TV.SecondHighestLink);
    }
    @Then("user switches to the new window")
    public void user_switches_to_the_new_window() {
        String mainPageHandle = driver.getWindowHandle();

        Set<String> allWindowHandles = driver.getWindowHandles();

        Iterator<String> it = allWindowHandles.iterator();
        mainPageHandle = it.next();
        String secondHandle = it.next();
        driver.switchTo().window(secondHandle);
    }
    @Then("user will verify About this item is present")
    public void user_will_verify_about_this_item_is_present() {
        String AboutTextActual = TV.AboutThisItem.getText();
        String AboutTextExpected = "Resolution : 4K Ultra HD (3840 x 2160) Resolution || Refresh Rate : 100 Hertz\n" +
                "Connectivity: 4 HDMI ports to connect set top box || Blu-ray speakers or a gaming console || 2 USB ports to connect hard drives or other USB devices\n" +
                "Sound: 60 Watts Output - 4.2.2 Ch|| Powerful Speakers with Dolby Atmos || Surround Sound || Active Voice Amplifier || Adaptive Sound+\n" +
                "Smart TV Features : Mirroring || Tap View ||Multi-View || Music Wall || Mobile Camera Support || Wireless Dex || Auto Game Mode (ALLM) || Game Motion Plus || Dynamic Black EQ || Surround Sound || Super Ultra Wide Game View ||Mini Map Zoom || FreeSync Premium Pro || HGiG\n" +
                "Display: Matte Display || One Billion Color || PQI 4600 || 100% Colour Volume with Quantum Dot || Wide Viewing Angle || AI Upscale || Neo Quantum Processor 4K || Quantum Matrix Technology || Motion Xcelerator Turbo Pro || Real Depth Enhancer || LED Clear Motion\n" +
                "Warranty Information: 1 year comprehensive warranty plus additional 1 years on panel by brand from date of invoice\n" +
                "Installation: TV Table stand is not included in the box with this model. customer may ask for Table Top Stand or Wall Mount which will be provided to the customer at the time of installation, please directly call Samsung support on [Please visit brand website for tollfree numbers] and provide product's model name as well as seller's details mentioned on the invoice\n" +
                "Easy Returns: This product is eligible for replacement within 10 days of delivery in case of any product defects, damage or features not matching the description";

        System.out.println(AboutTextActual);

        Assert.assertEquals(AboutTextExpected, AboutTextActual);
    }
}
