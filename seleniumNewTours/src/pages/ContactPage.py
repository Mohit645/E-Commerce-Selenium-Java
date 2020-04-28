'''
Created on Apr 28, 2020

@author: Mohit
'''
from utils.Locators import ContactPageLocators

class ContactPage:
    def __init__(self, driver):
        self.locator = ContactPageLocators
        super().__init__(driver)
    
    def clickOnContact(self):
        self.locator.contactButton.click()
        
    def clickOnBackHomeButton(self):
        self.locator.backHomeButton.click()
        
    def giveCurrentUrl(self):
        return self.locator.driver.current_url
        
    