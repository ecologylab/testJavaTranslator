package ecologylab.translators.java.generics;

/**
 * Automatically generated by JavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.serialization.annotations.Hint;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.translators.java.generics.SearchResult;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SocialSearchResult extends SearchResult
{
	@simpl_scalar
	@simpl_hints({Hint.XML_ATTRIBUTE})
	private String authorName;

	public SocialSearchResult()
	{ super(); }

	public String getAuthorName()
	{
		return authorName;
	}

	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
}
