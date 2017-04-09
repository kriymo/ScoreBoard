/*
 * Author: Krupa Harthi
 * This test class tests the public double getRating(long teamId) method of TrueSkillGameRating
 */

package dk.frankbille.scoreboard.ratings.trueskill;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestTrueSkill2 {
	TrueSkillGameRating rating;
	long winnerTeamId;
	double winnerRating; 
	double winnerChange; 
	long loserTeamId;
	double loserRating; 
	double loserChange;
	
	@Before
	public void setupRating() {
		this.winnerTeamId = 5;
		this.winnerRating = 1;
		this.winnerChange = 8;
		this.loserTeamId = 18;
		this.loserRating = 0;
		this.loserChange = 2;

		rating = new TrueSkillGameRating(winnerTeamId, winnerRating, winnerChange, loserTeamId, loserRating, loserChange);
	}

	/**
	 * This test tests the getRating method for valid WinnerTeamID
	 * Expected winnerRating value to be returned
	 */
	@Test
	public void testgetRatingEqualsWinnerTeadID() {
			assertEquals(1, rating.getRating(5), 0);
		
			}
	
	/**
	 * This test tests the getRating method for valid LoserTeamID
	 * Expected loserRating value to be returned
	 */
	@Test
	public void testgetRatingEqualsLoserTeadID() {
			assertEquals(0, rating.getRating(18), 0);
		
			}
	
	
	/**
	 * This test tests the getRating method for invalid teamID
	 * Expecting exception
	 */
	@Test
	public void testgetRatingEqualsInvalidTeadID() {
		
		try
		{
			rating.getRating(99);
		}
		catch(IllegalArgumentException e)
		{
			assertEquals(e.getMessage(), "Team id 99 not found in rating");
		}
			
		
		}

}
