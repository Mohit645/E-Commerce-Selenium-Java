'''
Created on Apr 26, 2020

@author: Mohit
'''
from selenium.webdriver.common.by import By
from selenium import webdriver
from utils.Utilities import webDriverUtil 

class MainPageLocators:
    obj_wDU = webDriverUtil()
    driver = obj_wDU.useDriver("chrome")
    driver.get(obj_wDU.baseUrl)
    
    userName = driver.find_element_by_xpath("//input[@name='userName']")
    passWord = driver.find_element_by_xpath("//input[@name='password']")
    signInButton = driver.find_element_by_xpath("//input[@name='login']")
    footerLine = driver.find_element_by_xpath("//div[@class='footer']")
    specialTable = driver.find_element_by_xpath("//table[@width='270']/tbody")
    dateOnPage = driver.find_element_by_xpath("//tbody/tr[1]/td[1]/font[1]/b[@xpath='1']")
    header = driver.find_element_by_xpath("//table/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]")

    
class ContactPageLocators:
    obj_wDU = webDriverUtil()
    driver = obj_wDU.useDriver("chrome")
    driver.get(obj_wDU.baseUrl)
    
    contactButton = driver.find_element_by_xpath("//a[text()='CONTACT']")
    backHomeButton = driver.find_element_by_xpath("//td/a/img")
    
    
    
    

    
    
    
     
    