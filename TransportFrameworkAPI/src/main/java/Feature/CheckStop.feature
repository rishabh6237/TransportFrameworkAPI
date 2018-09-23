Feature: API Testing

Scenario Outline: A stop providing multiple transport options can be located

Given Phileas is looking for a stop
When he searches for "<Station>"
Then a stop named "<Stop Found>" is found
And the stop provides more than one mode of transport



Examples:
	|Station 	     |Stop Found          |
	|Wynyard Station|Wynyard Station, Sydney    |