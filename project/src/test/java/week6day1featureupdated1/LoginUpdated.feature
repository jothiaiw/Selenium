Feature: Leaftaps login


Background:
Given open Browser2
And Maximize2
And Set Timeouts2
And Load URL2

Scenario Outline: Positive flow testing
And Username1 as <Un>
And password1 as <Pw>
When click login button2
Then verify login successful2
And Click CRM2
And Click lead2
And Create lead2
And Give cmpy name2 as <Cm>
And Give first name2 as <Fn>
And Give last name2 as <Ln>
And Submit2
And verify completion2



Examples:
	|Un|Pw|Cm|Fn|Ln|
	|DemoSalesManager|crmsfa|Wipro|jothi|B|
	|DemoCSR|crmsfa|CTS|Jo|B|
