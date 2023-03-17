Feature: Default

	#AC1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
	@UPGNX10-228
	Scenario: Verify Users can log in with valid credentials
		When User in on log in page
		Then User enters email address end password
		And user clicks on the log in button