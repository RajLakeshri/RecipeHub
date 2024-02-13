package com.demo.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Recipe {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long recipeId;
	    
	    @Column(nullable = false)
	    private String title;
	    
	    @Column
	    private String description;
	    
	    @ElementCollection
	    private List<String> ingredients;
	    
	    @Column(columnDefinition = "TEXT")
	    private String instructions;
	    
	    @Column
	    private int cookingTime;
	    
	    @Column
	    private String difficultyLevel;
	    
	    @Column
	    private String imageUrl;
	    
	    @Column(nullable = false)
	    private LocalDateTime creationDate;
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

		public Recipe() {
			super();
		}

		public Recipe(Long recipeId, String title, String description, List<String> ingredients, String instructions,
				int cookingTime, String difficultyLevel, String imageUrl, LocalDateTime creationDate, User user) {
			super();
			this.recipeId = recipeId;
			this.title = title;
			this.description = description;
			this.ingredients = ingredients;
			this.instructions = instructions;
			this.cookingTime = cookingTime;
			this.difficultyLevel = difficultyLevel;
			this.imageUrl = imageUrl;
			this.creationDate = creationDate;
			this.user = user;
		}

		public Long getRecipeId() {
			return recipeId;
		}

		public void setRecipeId(Long recipeId) {
			this.recipeId = recipeId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<String> getIngredients() {
			return ingredients;
		}

		public void setIngredients(List<String> ingredients) {
			this.ingredients = ingredients;
		}

		public String getInstructions() {
			return instructions;
		}

		public void setInstructions(String instructions) {
			this.instructions = instructions;
		}

		public int getCookingTime() {
			return cookingTime;
		}

		public void setCookingTime(int cookingTime) {
			this.cookingTime = cookingTime;
		}

		public String getDifficultyLevel() {
			return difficultyLevel;
		}

		public void setDifficultyLevel(String difficultyLevel) {
			this.difficultyLevel = difficultyLevel;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public LocalDateTime getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(LocalDateTime creationDate) {
			this.creationDate = creationDate;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
	    
	    
}
