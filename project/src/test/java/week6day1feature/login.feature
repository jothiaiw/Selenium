Feature: Leaftaps login

Scenario:  Positive flow testing

Given open Browser
And Maximize
And Set Timeouts
And Load URL
And Username 
And password

When click login button
Then verify login successful

And Click CRM
And Click lead
And Create lead
And Give cmpy name
And Give first name
And Give last name
And Submit
And verify completion




