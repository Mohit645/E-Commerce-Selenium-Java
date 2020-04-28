'''
Created on Apr 26, 2020

@author: Mohit
'''
from selenium import webdriver
from selenium.webdriver.chrome.webdriver import WebDriver
from webdriver_manager.chrome import ChromeDriverManager
from webdriver_manager.firefox import GeckoDriverManager

class webDriverUtil:
    def __init__(self):
        self.driverName = None
        self.baseUrl = "http://newtours.demoaut.com/"
    
    #driverName = None
    def useDriver(self, driverName):
        self.driverName = driverName
        if(self.driverName=='chrome'):
            driver = webdriver.Chrome(executable_path=ChromeDriverManager().install())
        elif(self.driverName=='gecko'):
            driver = webdriver.Firefox(executable_path=GeckoDriverManager().install())
    
            
        return driver    
            
            
    