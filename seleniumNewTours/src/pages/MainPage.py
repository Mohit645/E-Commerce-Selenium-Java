'''
Created on Apr 27, 2020

@author: Mohit
'''

from utils.Locators import MainPageLocators

class MainPage:
    def __init__(self, driver):
        self.locator = MainPageLocators
        super().__init__(driver)
        
    def grabDateOnThePage(self):
        return self.locator.dateOnPage.text
    
    def provideUserName(self, username):
        self.locator.userName.send_keys(username)
    
    def providePassword(self, password):
        self.locator.passWord.send_keys(password)
        
    def clickSignIn(self):
        self.locator.signInButton.click()
        
    def getFooterContent(self):
        return self.locator.footerLine.text
    
    def getSpecialAmount(self, itineary):
        specialAmount = 200
        specialTable = self.locator.specialTable
        tableSize = 5
        for i in range(1, tableSize+1):
            if(specialTable.find_element_by_xpath("tr[{}]/td[{}]".format(i, 1)).text ==itineary):
                specialAmount = specialTable.find_element_by_xpath("tr[{}]/td[{}]".format(i, 2)).text
        
        return specialAmount 
    
    def getHeaderTabs(self):
        headerList = list()
        for i in range(1,5):
            buttonName = self.locator.header.find_element_by_xpath("td[%s]" %i).text
            headerList.append(buttonName)
        return headerList    
            
       
        