package library_tscope;

/**
 * Automatically generated by JavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.serialization.SimplTypesScope;
import java.util.List;
import java.util.Map;

public class LibraryTranslationScope
{

	protected static final Class TRANSLATIONS[] =
	{
		ecologylab.translators.java.generics.Search.class,

		ecologylab.translators.java.generics.SearchResult.class,

		ecologylab.translators.java.generics.SocialSearch.class,

		ecologylab.translators.java.generics.SocialSearchResult.class,

		ecologylab.translators.java.generics.TypedSocialSearch.class,

	};

	public static SimplTypesScope get()
	{
		return SimplTypesScope.get("test-adv-generics-1", TRANSLATIONS);
	}

}
