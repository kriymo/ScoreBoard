/*
 * Author: Krupa Harthi
 * This test class tests the public double getChange(long teamId) method of TrueSkillGameRating
 */

package dk.frankbille.scoreboard.ratings.trueskill;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestTrueSkill1 {
	TrueSkillGameRating rating;
	long winnerTeamId;
	double winnerRating; 
	double winnerChange; 
	long loserTeamId;
	double loserRating; 
	double loserChange;
	
	@Before
	public void setupRating() {
		this.winnerTeamId = 10;
		this.winnerRating = 1;
		this.winnerChange = 8;
		this.loserTeamId = 15;
		this.loserRating = 0;
		this.loserChange = 2;

		rating = new TrueSkillGameRating(winnerTeamId, winnerRating, winnerChange, loserTeamId, loserRating, loserChange);
	}

	/**
	 * This test tests the getChange method for valid WinnerTeamID
	 * Expected winnerChange value to be returned
	 */
	@Test
	public void testgetChangeEqualsWinnerTeadID() {
			assertEquals(8, rating.getChange(10), 0);
		
			}
	
	/**
	 * This test tests the getChange method for valid LoserTeamID
	 * Expected loserChange value to be returned
	 */
	@Test
	public void testgetChangeEqualsLoserTeadID() {
			assertEquals(2, rating.getChange(15), 0);
		
			}
	
	
	/**
	 * This test tests the getChange method for invalid teamID
	 * Expecting exception
	 */
	@Test
	public void testgetChangeEqualsInvalidTeadID() {
		
		try
		{
			rating.getChange(60);
		}
		catch(IllegalArgumentException e)
		{
			assertEquals(e.getMessage(), "Team id 60 not found in rating");
		}
			
		
		}
	
}
