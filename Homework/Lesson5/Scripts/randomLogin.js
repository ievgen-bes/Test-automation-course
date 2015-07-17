Selenium.prototype.doTypeRandomLogin = function(locator) {
    /**
    * Sets the value of an input field to a random login id, 
    * as though you typed it in.
    *
    * @param locator an <a href="#locators">element locator</a>
    */
 
    // All locator-strategies are automatically handled by "findElement"
    var element = this.page().findElement(locator);
 
    /* The following block generates a random email string */
    var allowedChars = "abcdefghiklmnopqrstuvwxyz123456789";
    var stringLength = 25;
    var randomstring = '';
 
    for (var i=0; i<stringLength; i++) {
        var rnum = Math.floor(Math.random() * allowedChars.length);
        randomstring += allowedChars.substring(rnum,rnum+1);
    }
	    randomstring += "20"
 
    // Replace the element text with the new text
    this.browserbot.replaceText(element, randomstring);
};