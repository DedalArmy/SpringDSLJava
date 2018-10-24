package org.xtext.spring.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.spring.services.SpringConfigDslJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpringConfigDslJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'public'", "'private'", "'protected'", "'class'", "'{'", "'}'", "'('", "')'", "'@DependsOn'", "'return'", "'new'", "'@Qualifier'", "'@Configuration'", "'@Import'", "'@ImportRessource'", "'value='", "','", "'.class'", "'@Bean'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSpringConfigDslJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpringConfigDslJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpringConfigDslJavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpringConfigDslJava.g"; }


    	private SpringConfigDslJavaGrammarAccess grammarAccess;

    	public void setGrammarAccess(SpringConfigDslJavaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSpringProject"
    // InternalSpringConfigDslJava.g:53:1: entryRuleSpringProject : ruleSpringProject EOF ;
    public final void entryRuleSpringProject() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:54:1: ( ruleSpringProject EOF )
            // InternalSpringConfigDslJava.g:55:1: ruleSpringProject EOF
            {
             before(grammarAccess.getSpringProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleSpringProject();

            state._fsp--;

             after(grammarAccess.getSpringProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpringProject"


    // $ANTLR start "ruleSpringProject"
    // InternalSpringConfigDslJava.g:62:1: ruleSpringProject : ( ( rule__SpringProject__Group__0 ) ) ;
    public final void ruleSpringProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:66:2: ( ( ( rule__SpringProject__Group__0 ) ) )
            // InternalSpringConfigDslJava.g:67:2: ( ( rule__SpringProject__Group__0 ) )
            {
            // InternalSpringConfigDslJava.g:67:2: ( ( rule__SpringProject__Group__0 ) )
            // InternalSpringConfigDslJava.g:68:3: ( rule__SpringProject__Group__0 )
            {
             before(grammarAccess.getSpringProjectAccess().getGroup()); 
            // InternalSpringConfigDslJava.g:69:3: ( rule__SpringProject__Group__0 )
            // InternalSpringConfigDslJava.g:69:4: rule__SpringProject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpringProject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpringProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpringProject"


    // $ANTLR start "entryRuleConfiguration"
    // InternalSpringConfigDslJava.g:78:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:79:1: ( ruleConfiguration EOF )
            // InternalSpringConfigDslJava.g:80:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalSpringConfigDslJava.g:87:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:91:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalSpringConfigDslJava.g:92:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalSpringConfigDslJava.g:92:2: ( ( rule__Configuration__Group__0 ) )
            // InternalSpringConfigDslJava.g:93:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalSpringConfigDslJava.g:94:3: ( rule__Configuration__Group__0 )
            // InternalSpringConfigDslJava.g:94:4: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleComponent"
    // InternalSpringConfigDslJava.g:103:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:104:1: ( ruleComponent EOF )
            // InternalSpringConfigDslJava.g:105:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSpringConfigDslJava.g:112:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:116:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalSpringConfigDslJava.g:117:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalSpringConfigDslJava.g:117:2: ( ( rule__Component__Group__0 ) )
            // InternalSpringConfigDslJava.g:118:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalSpringConfigDslJava.g:119:3: ( rule__Component__Group__0 )
            // InternalSpringConfigDslJava.g:119:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleCreationMethod"
    // InternalSpringConfigDslJava.g:128:1: entryRuleCreationMethod : ruleCreationMethod EOF ;
    public final void entryRuleCreationMethod() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:129:1: ( ruleCreationMethod EOF )
            // InternalSpringConfigDslJava.g:130:1: ruleCreationMethod EOF
            {
             before(grammarAccess.getCreationMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleCreationMethod();

            state._fsp--;

             after(grammarAccess.getCreationMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreationMethod"


    // $ANTLR start "ruleCreationMethod"
    // InternalSpringConfigDslJava.g:137:1: ruleCreationMethod : ( ( rule__CreationMethod__ClassAssignment ) ) ;
    public final void ruleCreationMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:141:2: ( ( ( rule__CreationMethod__ClassAssignment ) ) )
            // InternalSpringConfigDslJava.g:142:2: ( ( rule__CreationMethod__ClassAssignment ) )
            {
            // InternalSpringConfigDslJava.g:142:2: ( ( rule__CreationMethod__ClassAssignment ) )
            // InternalSpringConfigDslJava.g:143:3: ( rule__CreationMethod__ClassAssignment )
            {
             before(grammarAccess.getCreationMethodAccess().getClassAssignment()); 
            // InternalSpringConfigDslJava.g:144:3: ( rule__CreationMethod__ClassAssignment )
            // InternalSpringConfigDslJava.g:144:4: rule__CreationMethod__ClassAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CreationMethod__ClassAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCreationMethodAccess().getClassAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreationMethod"


    // $ANTLR start "entryRuleClass"
    // InternalSpringConfigDslJava.g:153:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:154:1: ( ruleClass EOF )
            // InternalSpringConfigDslJava.g:155:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSpringConfigDslJava.g:162:1: ruleClass : ( ( rule__Class__ClassnameAssignment ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:166:2: ( ( ( rule__Class__ClassnameAssignment ) ) )
            // InternalSpringConfigDslJava.g:167:2: ( ( rule__Class__ClassnameAssignment ) )
            {
            // InternalSpringConfigDslJava.g:167:2: ( ( rule__Class__ClassnameAssignment ) )
            // InternalSpringConfigDslJava.g:168:3: ( rule__Class__ClassnameAssignment )
            {
             before(grammarAccess.getClassAccess().getClassnameAssignment()); 
            // InternalSpringConfigDslJava.g:169:3: ( rule__Class__ClassnameAssignment )
            // InternalSpringConfigDslJava.g:169:4: rule__Class__ClassnameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Class__ClassnameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getClassnameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAnnotationConfiguration"
    // InternalSpringConfigDslJava.g:178:1: entryRuleAnnotationConfiguration : ruleAnnotationConfiguration EOF ;
    public final void entryRuleAnnotationConfiguration() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:179:1: ( ruleAnnotationConfiguration EOF )
            // InternalSpringConfigDslJava.g:180:1: ruleAnnotationConfiguration EOF
            {
             before(grammarAccess.getAnnotationConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotationConfiguration();

            state._fsp--;

             after(grammarAccess.getAnnotationConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotationConfiguration"


    // $ANTLR start "ruleAnnotationConfiguration"
    // InternalSpringConfigDslJava.g:187:1: ruleAnnotationConfiguration : ( ( rule__AnnotationConfiguration__Group__0 ) ) ;
    public final void ruleAnnotationConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:191:2: ( ( ( rule__AnnotationConfiguration__Group__0 ) ) )
            // InternalSpringConfigDslJava.g:192:2: ( ( rule__AnnotationConfiguration__Group__0 ) )
            {
            // InternalSpringConfigDslJava.g:192:2: ( ( rule__AnnotationConfiguration__Group__0 ) )
            // InternalSpringConfigDslJava.g:193:3: ( rule__AnnotationConfiguration__Group__0 )
            {
             before(grammarAccess.getAnnotationConfigurationAccess().getGroup()); 
            // InternalSpringConfigDslJava.g:194:3: ( rule__AnnotationConfiguration__Group__0 )
            // InternalSpringConfigDslJava.g:194:4: rule__AnnotationConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationConfiguration"


    // $ANTLR start "entryRuleImportAnnotations"
    // InternalSpringConfigDslJava.g:203:1: entryRuleImportAnnotations : ruleImportAnnotations EOF ;
    public final void entryRuleImportAnnotations() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:204:1: ( ruleImportAnnotations EOF )
            // InternalSpringConfigDslJava.g:205:1: ruleImportAnnotations EOF
            {
             before(grammarAccess.getImportAnnotationsRule()); 
            pushFollow(FOLLOW_1);
            ruleImportAnnotations();

            state._fsp--;

             after(grammarAccess.getImportAnnotationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportAnnotations"


    // $ANTLR start "ruleImportAnnotations"
    // InternalSpringConfigDslJava.g:212:1: ruleImportAnnotations : ( ( rule__ImportAnnotations__Alternatives ) ) ;
    public final void ruleImportAnnotations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:216:2: ( ( ( rule__ImportAnnotations__Alternatives ) ) )
            // InternalSpringConfigDslJava.g:217:2: ( ( rule__ImportAnnotations__Alternatives ) )
            {
            // InternalSpringConfigDslJava.g:217:2: ( ( rule__ImportAnnotations__Alternatives ) )
            // InternalSpringConfigDslJava.g:218:3: ( rule__ImportAnnotations__Alternatives )
            {
             before(grammarAccess.getImportAnnotationsAccess().getAlternatives()); 
            // InternalSpringConfigDslJava.g:219:3: ( rule__ImportAnnotations__Alternatives )
            // InternalSpringConfigDslJava.g:219:4: rule__ImportAnnotations__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportAnnotationsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportAnnotations"


    // $ANTLR start "entryRuleImportFormatRules"
    // InternalSpringConfigDslJava.g:228:1: entryRuleImportFormatRules : ruleImportFormatRules EOF ;
    public final void entryRuleImportFormatRules() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:229:1: ( ruleImportFormatRules EOF )
            // InternalSpringConfigDslJava.g:230:1: ruleImportFormatRules EOF
            {
             before(grammarAccess.getImportFormatRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleImportFormatRules();

            state._fsp--;

             after(grammarAccess.getImportFormatRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportFormatRules"


    // $ANTLR start "ruleImportFormatRules"
    // InternalSpringConfigDslJava.g:237:1: ruleImportFormatRules : ( ( rule__ImportFormatRules__Alternatives ) ) ;
    public final void ruleImportFormatRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:241:2: ( ( ( rule__ImportFormatRules__Alternatives ) ) )
            // InternalSpringConfigDslJava.g:242:2: ( ( rule__ImportFormatRules__Alternatives ) )
            {
            // InternalSpringConfigDslJava.g:242:2: ( ( rule__ImportFormatRules__Alternatives ) )
            // InternalSpringConfigDslJava.g:243:3: ( rule__ImportFormatRules__Alternatives )
            {
             before(grammarAccess.getImportFormatRulesAccess().getAlternatives()); 
            // InternalSpringConfigDslJava.g:244:3: ( rule__ImportFormatRules__Alternatives )
            // InternalSpringConfigDslJava.g:244:4: rule__ImportFormatRules__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportFormatRulesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportFormatRules"


    // $ANTLR start "entryRuleStringListAnnotation"
    // InternalSpringConfigDslJava.g:253:1: entryRuleStringListAnnotation : ruleStringListAnnotation EOF ;
    public final void entryRuleStringListAnnotation() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:254:1: ( ruleStringListAnnotation EOF )
            // InternalSpringConfigDslJava.g:255:1: ruleStringListAnnotation EOF
            {
             before(grammarAccess.getStringListAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringListAnnotation();

            state._fsp--;

             after(grammarAccess.getStringListAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringListAnnotation"


    // $ANTLR start "ruleStringListAnnotation"
    // InternalSpringConfigDslJava.g:262:1: ruleStringListAnnotation : ( ( rule__StringListAnnotation__Alternatives ) ) ;
    public final void ruleStringListAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:266:2: ( ( ( rule__StringListAnnotation__Alternatives ) ) )
            // InternalSpringConfigDslJava.g:267:2: ( ( rule__StringListAnnotation__Alternatives ) )
            {
            // InternalSpringConfigDslJava.g:267:2: ( ( rule__StringListAnnotation__Alternatives ) )
            // InternalSpringConfigDslJava.g:268:3: ( rule__StringListAnnotation__Alternatives )
            {
             before(grammarAccess.getStringListAnnotationAccess().getAlternatives()); 
            // InternalSpringConfigDslJava.g:269:3: ( rule__StringListAnnotation__Alternatives )
            // InternalSpringConfigDslJava.g:269:4: rule__StringListAnnotation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringListAnnotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringListAnnotationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringListAnnotation"


    // $ANTLR start "entryRuleStringList"
    // InternalSpringConfigDslJava.g:278:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:279:1: ( ruleStringList EOF )
            // InternalSpringConfigDslJava.g:280:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_1);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // InternalSpringConfigDslJava.g:287:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:291:2: ( ( ( rule__StringList__Group__0 ) ) )
            // InternalSpringConfigDslJava.g:292:2: ( ( rule__StringList__Group__0 ) )
            {
            // InternalSpringConfigDslJava.g:292:2: ( ( rule__StringList__Group__0 ) )
            // InternalSpringConfigDslJava.g:293:3: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // InternalSpringConfigDslJava.g:294:3: ( rule__StringList__Group__0 )
            // InternalSpringConfigDslJava.g:294:4: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringList"


    // $ANTLR start "entryRuleClassFileExtensions"
    // InternalSpringConfigDslJava.g:303:1: entryRuleClassFileExtensions : ruleClassFileExtensions EOF ;
    public final void entryRuleClassFileExtensions() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:304:1: ( ruleClassFileExtensions EOF )
            // InternalSpringConfigDslJava.g:305:1: ruleClassFileExtensions EOF
            {
             before(grammarAccess.getClassFileExtensionsRule()); 
            pushFollow(FOLLOW_1);
            ruleClassFileExtensions();

            state._fsp--;

             after(grammarAccess.getClassFileExtensionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassFileExtensions"


    // $ANTLR start "ruleClassFileExtensions"
    // InternalSpringConfigDslJava.g:312:1: ruleClassFileExtensions : ( ( rule__ClassFileExtensions__Group__0 ) ) ;
    public final void ruleClassFileExtensions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:316:2: ( ( ( rule__ClassFileExtensions__Group__0 ) ) )
            // InternalSpringConfigDslJava.g:317:2: ( ( rule__ClassFileExtensions__Group__0 ) )
            {
            // InternalSpringConfigDslJava.g:317:2: ( ( rule__ClassFileExtensions__Group__0 ) )
            // InternalSpringConfigDslJava.g:318:3: ( rule__ClassFileExtensions__Group__0 )
            {
             before(grammarAccess.getClassFileExtensionsAccess().getGroup()); 
            // InternalSpringConfigDslJava.g:319:3: ( rule__ClassFileExtensions__Group__0 )
            // InternalSpringConfigDslJava.g:319:4: rule__ClassFileExtensions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFileExtensions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassFileExtensionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassFileExtensions"


    // $ANTLR start "entryRuleClassFileExtension"
    // InternalSpringConfigDslJava.g:328:1: entryRuleClassFileExtension : ruleClassFileExtension EOF ;
    public final void entryRuleClassFileExtension() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:329:1: ( ruleClassFileExtension EOF )
            // InternalSpringConfigDslJava.g:330:1: ruleClassFileExtension EOF
            {
             before(grammarAccess.getClassFileExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleClassFileExtension();

            state._fsp--;

             after(grammarAccess.getClassFileExtensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassFileExtension"


    // $ANTLR start "ruleClassFileExtension"
    // InternalSpringConfigDslJava.g:337:1: ruleClassFileExtension : ( ( rule__ClassFileExtension__Group__0 ) ) ;
    public final void ruleClassFileExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:341:2: ( ( ( rule__ClassFileExtension__Group__0 ) ) )
            // InternalSpringConfigDslJava.g:342:2: ( ( rule__ClassFileExtension__Group__0 ) )
            {
            // InternalSpringConfigDslJava.g:342:2: ( ( rule__ClassFileExtension__Group__0 ) )
            // InternalSpringConfigDslJava.g:343:3: ( rule__ClassFileExtension__Group__0 )
            {
             before(grammarAccess.getClassFileExtensionAccess().getGroup()); 
            // InternalSpringConfigDslJava.g:344:3: ( rule__ClassFileExtension__Group__0 )
            // InternalSpringConfigDslJava.g:344:4: rule__ClassFileExtension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassFileExtension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassFileExtensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassFileExtension"


    // $ANTLR start "entryRuleEOL"
    // InternalSpringConfigDslJava.g:353:1: entryRuleEOL : ruleEOL EOF ;
    public final void entryRuleEOL() throws RecognitionException {
        try {
            // InternalSpringConfigDslJava.g:354:1: ( ruleEOL EOF )
            // InternalSpringConfigDslJava.g:355:1: ruleEOL EOF
            {
             before(grammarAccess.getEOLRule()); 
            pushFollow(FOLLOW_1);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getEOLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEOL"


    // $ANTLR start "ruleEOL"
    // InternalSpringConfigDslJava.g:362:1: ruleEOL : ( ';' ) ;
    public final void ruleEOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:366:2: ( ( ';' ) )
            // InternalSpringConfigDslJava.g:367:2: ( ';' )
            {
            // InternalSpringConfigDslJava.g:367:2: ( ';' )
            // InternalSpringConfigDslJava.g:368:3: ';'
            {
             before(grammarAccess.getEOLAccess().getSemicolonKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEOLAccess().getSemicolonKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEOL"


    // $ANTLR start "ruleVisibility"
    // InternalSpringConfigDslJava.g:378:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:382:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalSpringConfigDslJava.g:383:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalSpringConfigDslJava.g:383:2: ( ( rule__Visibility__Alternatives ) )
            // InternalSpringConfigDslJava.g:384:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalSpringConfigDslJava.g:385:3: ( rule__Visibility__Alternatives )
            // InternalSpringConfigDslJava.g:385:4: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__Component__NamesAlternatives_1_1_1_0"
    // InternalSpringConfigDslJava.g:393:1: rule__Component__NamesAlternatives_1_1_1_0 : ( ( RULE_STRING ) | ( ruleStringListAnnotation ) );
    public final void rule__Component__NamesAlternatives_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:397:1: ( ( RULE_STRING ) | ( ruleStringListAnnotation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==16||LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpringConfigDslJava.g:398:2: ( RULE_STRING )
                    {
                    // InternalSpringConfigDslJava.g:398:2: ( RULE_STRING )
                    // InternalSpringConfigDslJava.g:399:3: RULE_STRING
                    {
                     before(grammarAccess.getComponentAccess().getNamesSTRINGTerminalRuleCall_1_1_1_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getNamesSTRINGTerminalRuleCall_1_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringConfigDslJava.g:404:2: ( ruleStringListAnnotation )
                    {
                    // InternalSpringConfigDslJava.g:404:2: ( ruleStringListAnnotation )
                    // InternalSpringConfigDslJava.g:405:3: ruleStringListAnnotation
                    {
                     before(grammarAccess.getComponentAccess().getNamesStringListAnnotationParserRuleCall_1_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringListAnnotation();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getNamesStringListAnnotationParserRuleCall_1_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NamesAlternatives_1_1_1_0"


    // $ANTLR start "rule__ImportAnnotations__Alternatives"
    // InternalSpringConfigDslJava.g:414:1: rule__ImportAnnotations__Alternatives : ( ( ( rule__ImportAnnotations__Group_0__0 ) ) | ( ( rule__ImportAnnotations__Group_1__0 ) ) );
    public final void rule__ImportAnnotations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:418:1: ( ( ( rule__ImportAnnotations__Group_0__0 ) ) | ( ( rule__ImportAnnotations__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSpringConfigDslJava.g:419:2: ( ( rule__ImportAnnotations__Group_0__0 ) )
                    {
                    // InternalSpringConfigDslJava.g:419:2: ( ( rule__ImportAnnotations__Group_0__0 ) )
                    // InternalSpringConfigDslJava.g:420:3: ( rule__ImportAnnotations__Group_0__0 )
                    {
                     before(grammarAccess.getImportAnnotationsAccess().getGroup_0()); 
                    // InternalSpringConfigDslJava.g:421:3: ( rule__ImportAnnotations__Group_0__0 )
                    // InternalSpringConfigDslJava.g:421:4: rule__ImportAnnotations__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportAnnotations__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAnnotationsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringConfigDslJava.g:425:2: ( ( rule__ImportAnnotations__Group_1__0 ) )
                    {
                    // InternalSpringConfigDslJava.g:425:2: ( ( rule__ImportAnnotations__Group_1__0 ) )
                    // InternalSpringConfigDslJava.g:426:3: ( rule__ImportAnnotations__Group_1__0 )
                    {
                     before(grammarAccess.getImportAnnotationsAccess().getGroup_1()); 
                    // InternalSpringConfigDslJava.g:427:3: ( rule__ImportAnnotations__Group_1__0 )
                    // InternalSpringConfigDslJava.g:427:4: rule__ImportAnnotations__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportAnnotations__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAnnotationsAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Alternatives"


    // $ANTLR start "rule__ImportFormatRules__Alternatives"
    // InternalSpringConfigDslJava.g:435:1: rule__ImportFormatRules__Alternatives : ( ( ( rule__ImportFormatRules__Group_0__0 ) ) | ( ( rule__ImportFormatRules__Alternatives_1 ) ) | ( ruleClassFileExtension ) | ( RULE_STRING ) );
    public final void rule__ImportFormatRules__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:439:1: ( ( ( rule__ImportFormatRules__Group_0__0 ) ) | ( ( rule__ImportFormatRules__Alternatives_1 ) ) | ( ruleClassFileExtension ) | ( RULE_STRING ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_STRING) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            case RULE_STRING:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpringConfigDslJava.g:440:2: ( ( rule__ImportFormatRules__Group_0__0 ) )
                    {
                    // InternalSpringConfigDslJava.g:440:2: ( ( rule__ImportFormatRules__Group_0__0 ) )
                    // InternalSpringConfigDslJava.g:441:3: ( rule__ImportFormatRules__Group_0__0 )
                    {
                     before(grammarAccess.getImportFormatRulesAccess().getGroup_0()); 
                    // InternalSpringConfigDslJava.g:442:3: ( rule__ImportFormatRules__Group_0__0 )
                    // InternalSpringConfigDslJava.g:442:4: rule__ImportFormatRules__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportFormatRules__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportFormatRulesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringConfigDslJava.g:446:2: ( ( rule__ImportFormatRules__Alternatives_1 ) )
                    {
                    // InternalSpringConfigDslJava.g:446:2: ( ( rule__ImportFormatRules__Alternatives_1 ) )
                    // InternalSpringConfigDslJava.g:447:3: ( rule__ImportFormatRules__Alternatives_1 )
                    {
                     before(grammarAccess.getImportFormatRulesAccess().getAlternatives_1()); 
                    // InternalSpringConfigDslJava.g:448:3: ( rule__ImportFormatRules__Alternatives_1 )
                    // InternalSpringConfigDslJava.g:448:4: rule__ImportFormatRules__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportFormatRules__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportFormatRulesAccess().getAlternatives_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringConfigDslJava.g:452:2: ( ruleClassFileExtension )
                    {
                    // InternalSpringConfigDslJava.g:452:2: ( ruleClassFileExtension )
                    // InternalSpringConfigDslJava.g:453:3: ruleClassFileExtension
                    {
                     before(grammarAccess.getImportFormatRulesAccess().getClassFileExtensionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleClassFileExtension();

                    state._fsp--;

                     after(grammarAccess.getImportFormatRulesAccess().getClassFileExtensionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringConfigDslJava.g:458:2: ( RULE_STRING )
                    {
                    // InternalSpringConfigDslJava.g:458:2: ( RULE_STRING )
                    // InternalSpringConfigDslJava.g:459:3: RULE_STRING
                    {
                     before(grammarAccess.getImportFormatRulesAccess().getSTRINGTerminalRuleCall_3()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getImportFormatRulesAccess().getSTRINGTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Alternatives"


    // $ANTLR start "rule__ImportFormatRules__Alternatives_1"
    // InternalSpringConfigDslJava.g:468:1: rule__ImportFormatRules__Alternatives_1 : ( ( ( rule__ImportFormatRules__Group_1_0__0 ) ) | ( ( rule__ImportFormatRules__Group_1_1__0 ) ) );
    public final void rule__ImportFormatRules__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:472:1: ( ( ( rule__ImportFormatRules__Group_1_0__0 ) ) | ( ( rule__ImportFormatRules__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpringConfigDslJava.g:473:2: ( ( rule__ImportFormatRules__Group_1_0__0 ) )
                    {
                    // InternalSpringConfigDslJava.g:473:2: ( ( rule__ImportFormatRules__Group_1_0__0 ) )
                    // InternalSpringConfigDslJava.g:474:3: ( rule__ImportFormatRules__Group_1_0__0 )
                    {
                     before(grammarAccess.getImportFormatRulesAccess().getGroup_1_0()); 
                    // InternalSpringConfigDslJava.g:475:3: ( rule__ImportFormatRules__Group_1_0__0 )
                    // InternalSpringConfigDslJava.g:475:4: rule__ImportFormatRules__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportFormatRules__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportFormatRulesAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringConfigDslJava.g:479:2: ( ( rule__ImportFormatRules__Group_1_1__0 ) )
                    {
                    // InternalSpringConfigDslJava.g:479:2: ( ( rule__ImportFormatRules__Group_1_1__0 ) )
                    // InternalSpringConfigDslJava.g:480:3: ( rule__ImportFormatRules__Group_1_1__0 )
                    {
                     before(grammarAccess.getImportFormatRulesAccess().getGroup_1_1()); 
                    // InternalSpringConfigDslJava.g:481:3: ( rule__ImportFormatRules__Group_1_1__0 )
                    // InternalSpringConfigDslJava.g:481:4: rule__ImportFormatRules__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportFormatRules__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportFormatRulesAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Alternatives_1"


    // $ANTLR start "rule__StringListAnnotation__Alternatives"
    // InternalSpringConfigDslJava.g:489:1: rule__StringListAnnotation__Alternatives : ( ( ( rule__StringListAnnotation__Group_0__0 ) ) | ( ( rule__StringListAnnotation__Group_1__0 ) ) );
    public final void rule__StringListAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:493:1: ( ( ( rule__StringListAnnotation__Group_0__0 ) ) | ( ( rule__StringListAnnotation__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpringConfigDslJava.g:494:2: ( ( rule__StringListAnnotation__Group_0__0 ) )
                    {
                    // InternalSpringConfigDslJava.g:494:2: ( ( rule__StringListAnnotation__Group_0__0 ) )
                    // InternalSpringConfigDslJava.g:495:3: ( rule__StringListAnnotation__Group_0__0 )
                    {
                     before(grammarAccess.getStringListAnnotationAccess().getGroup_0()); 
                    // InternalSpringConfigDslJava.g:496:3: ( rule__StringListAnnotation__Group_0__0 )
                    // InternalSpringConfigDslJava.g:496:4: rule__StringListAnnotation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringListAnnotation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringListAnnotationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringConfigDslJava.g:500:2: ( ( rule__StringListAnnotation__Group_1__0 ) )
                    {
                    // InternalSpringConfigDslJava.g:500:2: ( ( rule__StringListAnnotation__Group_1__0 ) )
                    // InternalSpringConfigDslJava.g:501:3: ( rule__StringListAnnotation__Group_1__0 )
                    {
                     before(grammarAccess.getStringListAnnotationAccess().getGroup_1()); 
                    // InternalSpringConfigDslJava.g:502:3: ( rule__StringListAnnotation__Group_1__0 )
                    // InternalSpringConfigDslJava.g:502:4: rule__StringListAnnotation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringListAnnotation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringListAnnotationAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalSpringConfigDslJava.g:510:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:514:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSpringConfigDslJava.g:515:2: ( ( 'public' ) )
                    {
                    // InternalSpringConfigDslJava.g:515:2: ( ( 'public' ) )
                    // InternalSpringConfigDslJava.g:516:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalSpringConfigDslJava.g:517:3: ( 'public' )
                    // InternalSpringConfigDslJava.g:517:4: 'public'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringConfigDslJava.g:521:2: ( ( 'private' ) )
                    {
                    // InternalSpringConfigDslJava.g:521:2: ( ( 'private' ) )
                    // InternalSpringConfigDslJava.g:522:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalSpringConfigDslJava.g:523:3: ( 'private' )
                    // InternalSpringConfigDslJava.g:523:4: 'private'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringConfigDslJava.g:527:2: ( ( 'protected' ) )
                    {
                    // InternalSpringConfigDslJava.g:527:2: ( ( 'protected' ) )
                    // InternalSpringConfigDslJava.g:528:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    // InternalSpringConfigDslJava.g:529:3: ( 'protected' )
                    // InternalSpringConfigDslJava.g:529:4: 'protected'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__SpringProject__Group__0"
    // InternalSpringConfigDslJava.g:537:1: rule__SpringProject__Group__0 : rule__SpringProject__Group__0__Impl rule__SpringProject__Group__1 ;
    public final void rule__SpringProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:541:1: ( rule__SpringProject__Group__0__Impl rule__SpringProject__Group__1 )
            // InternalSpringConfigDslJava.g:542:2: rule__SpringProject__Group__0__Impl rule__SpringProject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SpringProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpringProject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpringProject__Group__0"


    // $ANTLR start "rule__SpringProject__Group__0__Impl"
    // InternalSpringConfigDslJava.g:549:1: rule__SpringProject__Group__0__Impl : ( () ) ;
    public final void rule__SpringProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:553:1: ( ( () ) )
            // InternalSpringConfigDslJava.g:554:1: ( () )
            {
            // InternalSpringConfigDslJava.g:554:1: ( () )
            // InternalSpringConfigDslJava.g:555:2: ()
            {
             before(grammarAccess.getSpringProjectAccess().getSpringProjectAction_0()); 
            // InternalSpringConfigDslJava.g:556:2: ()
            // InternalSpringConfigDslJava.g:556:3: 
            {
            }

             after(grammarAccess.getSpringProjectAccess().getSpringProjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpringProject__Group__0__Impl"


    // $ANTLR start "rule__SpringProject__Group__1"
    // InternalSpringConfigDslJava.g:564:1: rule__SpringProject__Group__1 : rule__SpringProject__Group__1__Impl ;
    public final void rule__SpringProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:568:1: ( rule__SpringProject__Group__1__Impl )
            // InternalSpringConfigDslJava.g:569:2: rule__SpringProject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpringProject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpringProject__Group__1"


    // $ANTLR start "rule__SpringProject__Group__1__Impl"
    // InternalSpringConfigDslJava.g:575:1: rule__SpringProject__Group__1__Impl : ( ( rule__SpringProject__ConfigurationsAssignment_1 ) ) ;
    public final void rule__SpringProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:579:1: ( ( ( rule__SpringProject__ConfigurationsAssignment_1 ) ) )
            // InternalSpringConfigDslJava.g:580:1: ( ( rule__SpringProject__ConfigurationsAssignment_1 ) )
            {
            // InternalSpringConfigDslJava.g:580:1: ( ( rule__SpringProject__ConfigurationsAssignment_1 ) )
            // InternalSpringConfigDslJava.g:581:2: ( rule__SpringProject__ConfigurationsAssignment_1 )
            {
             before(grammarAccess.getSpringProjectAccess().getConfigurationsAssignment_1()); 
            // InternalSpringConfigDslJava.g:582:2: ( rule__SpringProject__ConfigurationsAssignment_1 )
            // InternalSpringConfigDslJava.g:582:3: rule__SpringProject__ConfigurationsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SpringProject__ConfigurationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpringProjectAccess().getConfigurationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpringProject__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalSpringConfigDslJava.g:591:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:595:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalSpringConfigDslJava.g:596:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // InternalSpringConfigDslJava.g:603:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:607:1: ( ( () ) )
            // InternalSpringConfigDslJava.g:608:1: ( () )
            {
            // InternalSpringConfigDslJava.g:608:1: ( () )
            // InternalSpringConfigDslJava.g:609:2: ()
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            // InternalSpringConfigDslJava.g:610:2: ()
            // InternalSpringConfigDslJava.g:610:3: 
            {
            }

             after(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // InternalSpringConfigDslJava.g:618:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:622:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalSpringConfigDslJava.g:623:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // InternalSpringConfigDslJava.g:630:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__AnnotationConfigurationAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:634:1: ( ( ( rule__Configuration__AnnotationConfigurationAssignment_1 ) ) )
            // InternalSpringConfigDslJava.g:635:1: ( ( rule__Configuration__AnnotationConfigurationAssignment_1 ) )
            {
            // InternalSpringConfigDslJava.g:635:1: ( ( rule__Configuration__AnnotationConfigurationAssignment_1 ) )
            // InternalSpringConfigDslJava.g:636:2: ( rule__Configuration__AnnotationConfigurationAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getAnnotationConfigurationAssignment_1()); 
            // InternalSpringConfigDslJava.g:637:2: ( rule__Configuration__AnnotationConfigurationAssignment_1 )
            // InternalSpringConfigDslJava.g:637:3: rule__Configuration__AnnotationConfigurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__AnnotationConfigurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getAnnotationConfigurationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // InternalSpringConfigDslJava.g:645:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:649:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalSpringConfigDslJava.g:650:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Configuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // InternalSpringConfigDslJava.g:657:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__ClassVisibilityAssignment_2 )? ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:661:1: ( ( ( rule__Configuration__ClassVisibilityAssignment_2 )? ) )
            // InternalSpringConfigDslJava.g:662:1: ( ( rule__Configuration__ClassVisibilityAssignment_2 )? )
            {
            // InternalSpringConfigDslJava.g:662:1: ( ( rule__Configuration__ClassVisibilityAssignment_2 )? )
            // InternalSpringConfigDslJava.g:663:2: ( rule__Configuration__ClassVisibilityAssignment_2 )?
            {
             before(grammarAccess.getConfigurationAccess().getClassVisibilityAssignment_2()); 
            // InternalSpringConfigDslJava.g:664:2: ( rule__Configuration__ClassVisibilityAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=14)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpringConfigDslJava.g:664:3: rule__Configuration__ClassVisibilityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configuration__ClassVisibilityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getClassVisibilityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__3"
    // InternalSpringConfigDslJava.g:672:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:676:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalSpringConfigDslJava.g:677:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3"


    // $ANTLR start "rule__Configuration__Group__3__Impl"
    // InternalSpringConfigDslJava.g:684:1: rule__Configuration__Group__3__Impl : ( 'class' ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:688:1: ( ( 'class' ) )
            // InternalSpringConfigDslJava.g:689:1: ( 'class' )
            {
            // InternalSpringConfigDslJava.g:689:1: ( 'class' )
            // InternalSpringConfigDslJava.g:690:2: 'class'
            {
             before(grammarAccess.getConfigurationAccess().getClassKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getClassKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3__Impl"


    // $ANTLR start "rule__Configuration__Group__4"
    // InternalSpringConfigDslJava.g:699:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:703:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // InternalSpringConfigDslJava.g:704:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4"


    // $ANTLR start "rule__Configuration__Group__4__Impl"
    // InternalSpringConfigDslJava.g:711:1: rule__Configuration__Group__4__Impl : ( RULE_ID ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:715:1: ( ( RULE_ID ) )
            // InternalSpringConfigDslJava.g:716:1: ( RULE_ID )
            {
            // InternalSpringConfigDslJava.g:716:1: ( RULE_ID )
            // InternalSpringConfigDslJava.g:717:2: RULE_ID
            {
             before(grammarAccess.getConfigurationAccess().getIDTerminalRuleCall_4()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getIDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4__Impl"


    // $ANTLR start "rule__Configuration__Group__5"
    // InternalSpringConfigDslJava.g:726:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:730:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // InternalSpringConfigDslJava.g:731:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Configuration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5"


    // $ANTLR start "rule__Configuration__Group__5__Impl"
    // InternalSpringConfigDslJava.g:738:1: rule__Configuration__Group__5__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:742:1: ( ( '{' ) )
            // InternalSpringConfigDslJava.g:743:1: ( '{' )
            {
            // InternalSpringConfigDslJava.g:743:1: ( '{' )
            // InternalSpringConfigDslJava.g:744:2: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5__Impl"


    // $ANTLR start "rule__Configuration__Group__6"
    // InternalSpringConfigDslJava.g:753:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl rule__Configuration__Group__7 ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:757:1: ( rule__Configuration__Group__6__Impl rule__Configuration__Group__7 )
            // InternalSpringConfigDslJava.g:758:2: rule__Configuration__Group__6__Impl rule__Configuration__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Configuration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__6"


    // $ANTLR start "rule__Configuration__Group__6__Impl"
    // InternalSpringConfigDslJava.g:765:1: rule__Configuration__Group__6__Impl : ( ( rule__Configuration__ComponentsAssignment_6 ) ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:769:1: ( ( ( rule__Configuration__ComponentsAssignment_6 ) ) )
            // InternalSpringConfigDslJava.g:770:1: ( ( rule__Configuration__ComponentsAssignment_6 ) )
            {
            // InternalSpringConfigDslJava.g:770:1: ( ( rule__Configuration__ComponentsAssignment_6 ) )
            // InternalSpringConfigDslJava.g:771:2: ( rule__Configuration__ComponentsAssignment_6 )
            {
             before(grammarAccess.getConfigurationAccess().getComponentsAssignment_6()); 
            // InternalSpringConfigDslJava.g:772:2: ( rule__Configuration__ComponentsAssignment_6 )
            // InternalSpringConfigDslJava.g:772:3: rule__Configuration__ComponentsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__ComponentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getComponentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__6__Impl"


    // $ANTLR start "rule__Configuration__Group__7"
    // InternalSpringConfigDslJava.g:780:1: rule__Configuration__Group__7 : rule__Configuration__Group__7__Impl ;
    public final void rule__Configuration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:784:1: ( rule__Configuration__Group__7__Impl )
            // InternalSpringConfigDslJava.g:785:2: rule__Configuration__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__7"


    // $ANTLR start "rule__Configuration__Group__7__Impl"
    // InternalSpringConfigDslJava.g:791:1: rule__Configuration__Group__7__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:795:1: ( ( '}' ) )
            // InternalSpringConfigDslJava.g:796:1: ( '}' )
            {
            // InternalSpringConfigDslJava.g:796:1: ( '}' )
            // InternalSpringConfigDslJava.g:797:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalSpringConfigDslJava.g:807:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:811:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalSpringConfigDslJava.g:812:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalSpringConfigDslJava.g:819:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:823:1: ( ( () ) )
            // InternalSpringConfigDslJava.g:824:1: ( () )
            {
            // InternalSpringConfigDslJava.g:824:1: ( () )
            // InternalSpringConfigDslJava.g:825:2: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // InternalSpringConfigDslJava.g:826:2: ()
            // InternalSpringConfigDslJava.g:826:3: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalSpringConfigDslJava.g:834:1: rule__Component__Group__1 : rule__Component__Group__1__Impl ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:838:1: ( rule__Component__Group__1__Impl )
            // InternalSpringConfigDslJava.g:839:2: rule__Component__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalSpringConfigDslJava.g:845:1: rule__Component__Group__1__Impl : ( ( rule__Component__UnorderedGroup_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:849:1: ( ( ( rule__Component__UnorderedGroup_1 ) ) )
            // InternalSpringConfigDslJava.g:850:1: ( ( rule__Component__UnorderedGroup_1 ) )
            {
            // InternalSpringConfigDslJava.g:850:1: ( ( rule__Component__UnorderedGroup_1 ) )
            // InternalSpringConfigDslJava.g:851:2: ( rule__Component__UnorderedGroup_1 )
            {
             before(grammarAccess.getComponentAccess().getUnorderedGroup_1()); 
            // InternalSpringConfigDslJava.g:852:2: ( rule__Component__UnorderedGroup_1 )
            // InternalSpringConfigDslJava.g:852:3: rule__Component__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group_1_1__0"
    // InternalSpringConfigDslJava.g:861:1: rule__Component__Group_1_1__0 : rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 ;
    public final void rule__Component__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:865:1: ( rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 )
            // InternalSpringConfigDslJava.g:866:2: rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__0"


    // $ANTLR start "rule__Component__Group_1_1__0__Impl"
    // InternalSpringConfigDslJava.g:873:1: rule__Component__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Component__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:877:1: ( ( '(' ) )
            // InternalSpringConfigDslJava.g:878:1: ( '(' )
            {
            // InternalSpringConfigDslJava.g:878:1: ( '(' )
            // InternalSpringConfigDslJava.g:879:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__0__Impl"


    // $ANTLR start "rule__Component__Group_1_1__1"
    // InternalSpringConfigDslJava.g:888:1: rule__Component__Group_1_1__1 : rule__Component__Group_1_1__1__Impl rule__Component__Group_1_1__2 ;
    public final void rule__Component__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:892:1: ( rule__Component__Group_1_1__1__Impl rule__Component__Group_1_1__2 )
            // InternalSpringConfigDslJava.g:893:2: rule__Component__Group_1_1__1__Impl rule__Component__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__1"


    // $ANTLR start "rule__Component__Group_1_1__1__Impl"
    // InternalSpringConfigDslJava.g:900:1: rule__Component__Group_1_1__1__Impl : ( ( rule__Component__NamesAssignment_1_1_1 ) ) ;
    public final void rule__Component__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:904:1: ( ( ( rule__Component__NamesAssignment_1_1_1 ) ) )
            // InternalSpringConfigDslJava.g:905:1: ( ( rule__Component__NamesAssignment_1_1_1 ) )
            {
            // InternalSpringConfigDslJava.g:905:1: ( ( rule__Component__NamesAssignment_1_1_1 ) )
            // InternalSpringConfigDslJava.g:906:2: ( rule__Component__NamesAssignment_1_1_1 )
            {
             before(grammarAccess.getComponentAccess().getNamesAssignment_1_1_1()); 
            // InternalSpringConfigDslJava.g:907:2: ( rule__Component__NamesAssignment_1_1_1 )
            // InternalSpringConfigDslJava.g:907:3: rule__Component__NamesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NamesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNamesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__1__Impl"


    // $ANTLR start "rule__Component__Group_1_1__2"
    // InternalSpringConfigDslJava.g:915:1: rule__Component__Group_1_1__2 : rule__Component__Group_1_1__2__Impl ;
    public final void rule__Component__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:919:1: ( rule__Component__Group_1_1__2__Impl )
            // InternalSpringConfigDslJava.g:920:2: rule__Component__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__2"


    // $ANTLR start "rule__Component__Group_1_1__2__Impl"
    // InternalSpringConfigDslJava.g:926:1: rule__Component__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Component__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:930:1: ( ( ')' ) )
            // InternalSpringConfigDslJava.g:931:1: ( ')' )
            {
            // InternalSpringConfigDslJava.g:931:1: ( ')' )
            // InternalSpringConfigDslJava.g:932:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__2__Impl"


    // $ANTLR start "rule__Component__Group_1_2__0"
    // InternalSpringConfigDslJava.g:942:1: rule__Component__Group_1_2__0 : rule__Component__Group_1_2__0__Impl rule__Component__Group_1_2__1 ;
    public final void rule__Component__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:946:1: ( rule__Component__Group_1_2__0__Impl rule__Component__Group_1_2__1 )
            // InternalSpringConfigDslJava.g:947:2: rule__Component__Group_1_2__0__Impl rule__Component__Group_1_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_2__0"


    // $ANTLR start "rule__Component__Group_1_2__0__Impl"
    // InternalSpringConfigDslJava.g:954:1: rule__Component__Group_1_2__0__Impl : ( '(' ) ;
    public final void rule__Component__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:958:1: ( ( '(' ) )
            // InternalSpringConfigDslJava.g:959:1: ( '(' )
            {
            // InternalSpringConfigDslJava.g:959:1: ( '(' )
            // InternalSpringConfigDslJava.g:960:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_2__0__Impl"


    // $ANTLR start "rule__Component__Group_1_2__1"
    // InternalSpringConfigDslJava.g:969:1: rule__Component__Group_1_2__1 : rule__Component__Group_1_2__1__Impl rule__Component__Group_1_2__2 ;
    public final void rule__Component__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:973:1: ( rule__Component__Group_1_2__1__Impl rule__Component__Group_1_2__2 )
            // InternalSpringConfigDslJava.g:974:2: rule__Component__Group_1_2__1__Impl rule__Component__Group_1_2__2
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_2__1"


    // $ANTLR start "rule__Component__Group_1_2__1__Impl"
    // InternalSpringConfigDslJava.g:981:1: rule__Component__Group_1_2__1__Impl : ( ( rule__Component__NameAssignment_1_2_1 ) ) ;
    public final void rule__Component__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:985:1: ( ( ( rule__Component__NameAssignment_1_2_1 ) ) )
            // InternalSpringConfigDslJava.g:986:1: ( ( rule__Component__NameAssignment_1_2_1 ) )
            {
            // InternalSpringConfigDslJava.g:986:1: ( ( rule__Component__NameAssignment_1_2_1 ) )
            // InternalSpringConfigDslJava.g:987:2: ( rule__Component__NameAssignment_1_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1_2_1()); 
            // InternalSpringConfigDslJava.g:988:2: ( rule__Component__NameAssignment_1_2_1 )
            // InternalSpringConfigDslJava.g:988:3: rule__Component__NameAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_2__1__Impl"


    // $ANTLR start "rule__Component__Group_1_2__2"
    // InternalSpringConfigDslJava.g:996:1: rule__Component__Group_1_2__2 : rule__Component__Group_1_2__2__Impl ;
    public final void rule__Component__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1000:1: ( rule__Component__Group_1_2__2__Impl )
            // InternalSpringConfigDslJava.g:1001:2: rule__Component__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_2__2"


    // $ANTLR start "rule__Component__Group_1_2__2__Impl"
    // InternalSpringConfigDslJava.g:1007:1: rule__Component__Group_1_2__2__Impl : ( ')' ) ;
    public final void rule__Component__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1011:1: ( ( ')' ) )
            // InternalSpringConfigDslJava.g:1012:1: ( ')' )
            {
            // InternalSpringConfigDslJava.g:1012:1: ( ')' )
            // InternalSpringConfigDslJava.g:1013:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_2_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_2__2__Impl"


    // $ANTLR start "rule__Component__Group_1_3__0"
    // InternalSpringConfigDslJava.g:1023:1: rule__Component__Group_1_3__0 : rule__Component__Group_1_3__0__Impl rule__Component__Group_1_3__1 ;
    public final void rule__Component__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1027:1: ( rule__Component__Group_1_3__0__Impl rule__Component__Group_1_3__1 )
            // InternalSpringConfigDslJava.g:1028:2: rule__Component__Group_1_3__0__Impl rule__Component__Group_1_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_3__0"


    // $ANTLR start "rule__Component__Group_1_3__0__Impl"
    // InternalSpringConfigDslJava.g:1035:1: rule__Component__Group_1_3__0__Impl : ( '@DependsOn' ) ;
    public final void rule__Component__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1039:1: ( ( '@DependsOn' ) )
            // InternalSpringConfigDslJava.g:1040:1: ( '@DependsOn' )
            {
            // InternalSpringConfigDslJava.g:1040:1: ( '@DependsOn' )
            // InternalSpringConfigDslJava.g:1041:2: '@DependsOn'
            {
             before(grammarAccess.getComponentAccess().getDependsOnKeyword_1_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getDependsOnKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_3__0__Impl"


    // $ANTLR start "rule__Component__Group_1_3__1"
    // InternalSpringConfigDslJava.g:1050:1: rule__Component__Group_1_3__1 : rule__Component__Group_1_3__1__Impl rule__Component__Group_1_3__2 ;
    public final void rule__Component__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1054:1: ( rule__Component__Group_1_3__1__Impl rule__Component__Group_1_3__2 )
            // InternalSpringConfigDslJava.g:1055:2: rule__Component__Group_1_3__1__Impl rule__Component__Group_1_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_3__1"


    // $ANTLR start "rule__Component__Group_1_3__1__Impl"
    // InternalSpringConfigDslJava.g:1062:1: rule__Component__Group_1_3__1__Impl : ( '(' ) ;
    public final void rule__Component__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1066:1: ( ( '(' ) )
            // InternalSpringConfigDslJava.g:1067:1: ( '(' )
            {
            // InternalSpringConfigDslJava.g:1067:1: ( '(' )
            // InternalSpringConfigDslJava.g:1068:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_3_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_3__1__Impl"


    // $ANTLR start "rule__Component__Group_1_3__2"
    // InternalSpringConfigDslJava.g:1077:1: rule__Component__Group_1_3__2 : rule__Component__Group_1_3__2__Impl rule__Component__Group_1_3__3 ;
    public final void rule__Component__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1081:1: ( rule__Component__Group_1_3__2__Impl rule__Component__Group_1_3__3 )
            // InternalSpringConfigDslJava.g:1082:2: rule__Component__Group_1_3__2__Impl rule__Component__Group_1_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_3__2"


    // $ANTLR start "rule__Component__Group_1_3__2__Impl"
    // InternalSpringConfigDslJava.g:1089:1: rule__Component__Group_1_3__2__Impl : ( ( rule__Component__DependsOnAssignment_1_3_2 ) ) ;
    public final void rule__Component__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1093:1: ( ( ( rule__Component__DependsOnAssignment_1_3_2 ) ) )
            // InternalSpringConfigDslJava.g:1094:1: ( ( rule__Component__DependsOnAssignment_1_3_2 ) )
            {
            // InternalSpringConfigDslJava.g:1094:1: ( ( rule__Component__DependsOnAssignment_1_3_2 ) )
            // InternalSpringConfigDslJava.g:1095:2: ( rule__Component__DependsOnAssignment_1_3_2 )
            {
             before(grammarAccess.getComponentAccess().getDependsOnAssignment_1_3_2()); 
            // InternalSpringConfigDslJava.g:1096:2: ( rule__Component__DependsOnAssignment_1_3_2 )
            // InternalSpringConfigDslJava.g:1096:3: rule__Component__DependsOnAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__DependsOnAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getDependsOnAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_3__2__Impl"


    // $ANTLR start "rule__Component__Group_1_3__3"
    // InternalSpringConfigDslJava.g:1104:1: rule__Component__Group_1_3__3 : rule__Component__Group_1_3__3__Impl ;
    public final void rule__Component__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1108:1: ( rule__Component__Group_1_3__3__Impl )
            // InternalSpringConfigDslJava.g:1109:2: rule__Component__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_1_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_3__3"


    // $ANTLR start "rule__Component__Group_1_3__3__Impl"
    // InternalSpringConfigDslJava.g:1115:1: rule__Component__Group_1_3__3__Impl : ( ')' ) ;
    public final void rule__Component__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1119:1: ( ( ')' ) )
            // InternalSpringConfigDslJava.g:1120:1: ( ')' )
            {
            // InternalSpringConfigDslJava.g:1120:1: ( ')' )
            // InternalSpringConfigDslJava.g:1121:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_3_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_3__3__Impl"


    // $ANTLR start "rule__Component__Group_1_4__0"
    // InternalSpringConfigDslJava.g:1131:1: rule__Component__Group_1_4__0 : rule__Component__Group_1_4__0__Impl rule__Component__Group_1_4__1 ;
    public final void rule__Component__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1135:1: ( rule__Component__Group_1_4__0__Impl rule__Component__Group_1_4__1 )
            // InternalSpringConfigDslJava.g:1136:2: rule__Component__Group_1_4__0__Impl rule__Component__Group_1_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__0"


    // $ANTLR start "rule__Component__Group_1_4__0__Impl"
    // InternalSpringConfigDslJava.g:1143:1: rule__Component__Group_1_4__0__Impl : ( ( rule__Component__Group_1_4_0__0 )? ) ;
    public final void rule__Component__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1147:1: ( ( ( rule__Component__Group_1_4_0__0 )? ) )
            // InternalSpringConfigDslJava.g:1148:1: ( ( rule__Component__Group_1_4_0__0 )? )
            {
            // InternalSpringConfigDslJava.g:1148:1: ( ( rule__Component__Group_1_4_0__0 )? )
            // InternalSpringConfigDslJava.g:1149:2: ( rule__Component__Group_1_4_0__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_1_4_0()); 
            // InternalSpringConfigDslJava.g:1150:2: ( rule__Component__Group_1_4_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpringConfigDslJava.g:1150:3: rule__Component__Group_1_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_1_4_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__0__Impl"


    // $ANTLR start "rule__Component__Group_1_4__1"
    // InternalSpringConfigDslJava.g:1158:1: rule__Component__Group_1_4__1 : rule__Component__Group_1_4__1__Impl rule__Component__Group_1_4__2 ;
    public final void rule__Component__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1162:1: ( rule__Component__Group_1_4__1__Impl rule__Component__Group_1_4__2 )
            // InternalSpringConfigDslJava.g:1163:2: rule__Component__Group_1_4__1__Impl rule__Component__Group_1_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__1"


    // $ANTLR start "rule__Component__Group_1_4__1__Impl"
    // InternalSpringConfigDslJava.g:1170:1: rule__Component__Group_1_4__1__Impl : ( ( rule__Component__ConstructorVisibilityAssignment_1_4_1 )? ) ;
    public final void rule__Component__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1174:1: ( ( ( rule__Component__ConstructorVisibilityAssignment_1_4_1 )? ) )
            // InternalSpringConfigDslJava.g:1175:1: ( ( rule__Component__ConstructorVisibilityAssignment_1_4_1 )? )
            {
            // InternalSpringConfigDslJava.g:1175:1: ( ( rule__Component__ConstructorVisibilityAssignment_1_4_1 )? )
            // InternalSpringConfigDslJava.g:1176:2: ( rule__Component__ConstructorVisibilityAssignment_1_4_1 )?
            {
             before(grammarAccess.getComponentAccess().getConstructorVisibilityAssignment_1_4_1()); 
            // InternalSpringConfigDslJava.g:1177:2: ( rule__Component__ConstructorVisibilityAssignment_1_4_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=12 && LA9_0<=14)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpringConfigDslJava.g:1177:3: rule__Component__ConstructorVisibilityAssignment_1_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__ConstructorVisibilityAssignment_1_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getConstructorVisibilityAssignment_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__1__Impl"


    // $ANTLR start "rule__Component__Group_1_4__2"
    // InternalSpringConfigDslJava.g:1185:1: rule__Component__Group_1_4__2 : rule__Component__Group_1_4__2__Impl rule__Component__Group_1_4__3 ;
    public final void rule__Component__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1189:1: ( rule__Component__Group_1_4__2__Impl rule__Component__Group_1_4__3 )
            // InternalSpringConfigDslJava.g:1190:2: rule__Component__Group_1_4__2__Impl rule__Component__Group_1_4__3
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_1_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__2"


    // $ANTLR start "rule__Component__Group_1_4__2__Impl"
    // InternalSpringConfigDslJava.g:1197:1: rule__Component__Group_1_4__2__Impl : ( ( rule__Component__ClassAssignment_1_4_2 ) ) ;
    public final void rule__Component__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1201:1: ( ( ( rule__Component__ClassAssignment_1_4_2 ) ) )
            // InternalSpringConfigDslJava.g:1202:1: ( ( rule__Component__ClassAssignment_1_4_2 ) )
            {
            // InternalSpringConfigDslJava.g:1202:1: ( ( rule__Component__ClassAssignment_1_4_2 ) )
            // InternalSpringConfigDslJava.g:1203:2: ( rule__Component__ClassAssignment_1_4_2 )
            {
             before(grammarAccess.getComponentAccess().getClassAssignment_1_4_2()); 
            // InternalSpringConfigDslJava.g:1204:2: ( rule__Component__ClassAssignment_1_4_2 )
            // InternalSpringConfigDslJava.g:1204:3: rule__Component__ClassAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__ClassAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getClassAssignment_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__2__Impl"


    // $ANTLR start "rule__Component__Group_1_4__3"
    // InternalSpringConfigDslJava.g:1212:1: rule__Component__Group_1_4__3 : rule__Component__Group_1_4__3__Impl rule__Component__Group_1_4__4 ;
    public final void rule__Component__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1216:1: ( rule__Component__Group_1_4__3__Impl rule__Component__Group_1_4__4 )
            // InternalSpringConfigDslJava.g:1217:2: rule__Component__Group_1_4__3__Impl rule__Component__Group_1_4__4
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group_1_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__3"


    // $ANTLR start "rule__Component__Group_1_4__3__Impl"
    // InternalSpringConfigDslJava.g:1224:1: rule__Component__Group_1_4__3__Impl : ( ( rule__Component__NameAssignment_1_4_3 ) ) ;
    public final void rule__Component__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1228:1: ( ( ( rule__Component__NameAssignment_1_4_3 ) ) )
            // InternalSpringConfigDslJava.g:1229:1: ( ( rule__Component__NameAssignment_1_4_3 ) )
            {
            // InternalSpringConfigDslJava.g:1229:1: ( ( rule__Component__NameAssignment_1_4_3 ) )
            // InternalSpringConfigDslJava.g:1230:2: ( rule__Component__NameAssignment_1_4_3 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1_4_3()); 
            // InternalSpringConfigDslJava.g:1231:2: ( rule__Component__NameAssignment_1_4_3 )
            // InternalSpringConfigDslJava.g:1231:3: rule__Component__NameAssignment_1_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1_4_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__3__Impl"


    // $ANTLR start "rule__Component__Group_1_4__4"
    // InternalSpringConfigDslJava.g:1239:1: rule__Component__Group_1_4__4 : rule__Component__Group_1_4__4__Impl rule__Component__Group_1_4__5 ;
    public final void rule__Component__Group_1_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1243:1: ( rule__Component__Group_1_4__4__Impl rule__Component__Group_1_4__5 )
            // InternalSpringConfigDslJava.g:1244:2: rule__Component__Group_1_4__4__Impl rule__Component__Group_1_4__5
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_1_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__4"


    // $ANTLR start "rule__Component__Group_1_4__4__Impl"
    // InternalSpringConfigDslJava.g:1251:1: rule__Component__Group_1_4__4__Impl : ( '(' ) ;
    public final void rule__Component__Group_1_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1255:1: ( ( '(' ) )
            // InternalSpringConfigDslJava.g:1256:1: ( '(' )
            {
            // InternalSpringConfigDslJava.g:1256:1: ( '(' )
            // InternalSpringConfigDslJava.g:1257:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_4_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__4__Impl"


    // $ANTLR start "rule__Component__Group_1_4__5"
    // InternalSpringConfigDslJava.g:1266:1: rule__Component__Group_1_4__5 : rule__Component__Group_1_4__5__Impl rule__Component__Group_1_4__6 ;
    public final void rule__Component__Group_1_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1270:1: ( rule__Component__Group_1_4__5__Impl rule__Component__Group_1_4__6 )
            // InternalSpringConfigDslJava.g:1271:2: rule__Component__Group_1_4__5__Impl rule__Component__Group_1_4__6
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group_1_4__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__5"


    // $ANTLR start "rule__Component__Group_1_4__5__Impl"
    // InternalSpringConfigDslJava.g:1278:1: rule__Component__Group_1_4__5__Impl : ( ')' ) ;
    public final void rule__Component__Group_1_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1282:1: ( ( ')' ) )
            // InternalSpringConfigDslJava.g:1283:1: ( ')' )
            {
            // InternalSpringConfigDslJava.g:1283:1: ( ')' )
            // InternalSpringConfigDslJava.g:1284:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_4_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__5__Impl"


    // $ANTLR start "rule__Component__Group_1_4__6"
    // InternalSpringConfigDslJava.g:1293:1: rule__Component__Group_1_4__6 : rule__Component__Group_1_4__6__Impl rule__Component__Group_1_4__7 ;
    public final void rule__Component__Group_1_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1297:1: ( rule__Component__Group_1_4__6__Impl rule__Component__Group_1_4__7 )
            // InternalSpringConfigDslJava.g:1298:2: rule__Component__Group_1_4__6__Impl rule__Component__Group_1_4__7
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group_1_4__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__6"


    // $ANTLR start "rule__Component__Group_1_4__6__Impl"
    // InternalSpringConfigDslJava.g:1305:1: rule__Component__Group_1_4__6__Impl : ( '{' ) ;
    public final void rule__Component__Group_1_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1309:1: ( ( '{' ) )
            // InternalSpringConfigDslJava.g:1310:1: ( '{' )
            {
            // InternalSpringConfigDslJava.g:1310:1: ( '{' )
            // InternalSpringConfigDslJava.g:1311:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1_4_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1_4_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__6__Impl"


    // $ANTLR start "rule__Component__Group_1_4__7"
    // InternalSpringConfigDslJava.g:1320:1: rule__Component__Group_1_4__7 : rule__Component__Group_1_4__7__Impl rule__Component__Group_1_4__8 ;
    public final void rule__Component__Group_1_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1324:1: ( rule__Component__Group_1_4__7__Impl rule__Component__Group_1_4__8 )
            // InternalSpringConfigDslJava.g:1325:2: rule__Component__Group_1_4__7__Impl rule__Component__Group_1_4__8
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group_1_4__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__7"


    // $ANTLR start "rule__Component__Group_1_4__7__Impl"
    // InternalSpringConfigDslJava.g:1332:1: rule__Component__Group_1_4__7__Impl : ( 'return' ) ;
    public final void rule__Component__Group_1_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1336:1: ( ( 'return' ) )
            // InternalSpringConfigDslJava.g:1337:1: ( 'return' )
            {
            // InternalSpringConfigDslJava.g:1337:1: ( 'return' )
            // InternalSpringConfigDslJava.g:1338:2: 'return'
            {
             before(grammarAccess.getComponentAccess().getReturnKeyword_1_4_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getReturnKeyword_1_4_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__7__Impl"


    // $ANTLR start "rule__Component__Group_1_4__8"
    // InternalSpringConfigDslJava.g:1347:1: rule__Component__Group_1_4__8 : rule__Component__Group_1_4__8__Impl rule__Component__Group_1_4__9 ;
    public final void rule__Component__Group_1_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1351:1: ( rule__Component__Group_1_4__8__Impl rule__Component__Group_1_4__9 )
            // InternalSpringConfigDslJava.g:1352:2: rule__Component__Group_1_4__8__Impl rule__Component__Group_1_4__9
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group_1_4__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__8"


    // $ANTLR start "rule__Component__Group_1_4__8__Impl"
    // InternalSpringConfigDslJava.g:1359:1: rule__Component__Group_1_4__8__Impl : ( 'new' ) ;
    public final void rule__Component__Group_1_4__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1363:1: ( ( 'new' ) )
            // InternalSpringConfigDslJava.g:1364:1: ( 'new' )
            {
            // InternalSpringConfigDslJava.g:1364:1: ( 'new' )
            // InternalSpringConfigDslJava.g:1365:2: 'new'
            {
             before(grammarAccess.getComponentAccess().getNewKeyword_1_4_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNewKeyword_1_4_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__8__Impl"


    // $ANTLR start "rule__Component__Group_1_4__9"
    // InternalSpringConfigDslJava.g:1374:1: rule__Component__Group_1_4__9 : rule__Component__Group_1_4__9__Impl rule__Component__Group_1_4__10 ;
    public final void rule__Component__Group_1_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1378:1: ( rule__Component__Group_1_4__9__Impl rule__Component__Group_1_4__10 )
            // InternalSpringConfigDslJava.g:1379:2: rule__Component__Group_1_4__9__Impl rule__Component__Group_1_4__10
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group_1_4__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__9"


    // $ANTLR start "rule__Component__Group_1_4__9__Impl"
    // InternalSpringConfigDslJava.g:1386:1: rule__Component__Group_1_4__9__Impl : ( ( rule__Component__ClassAssignment_1_4_9 ) ) ;
    public final void rule__Component__Group_1_4__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1390:1: ( ( ( rule__Component__ClassAssignment_1_4_9 ) ) )
            // InternalSpringConfigDslJava.g:1391:1: ( ( rule__Component__ClassAssignment_1_4_9 ) )
            {
            // InternalSpringConfigDslJava.g:1391:1: ( ( rule__Component__ClassAssignment_1_4_9 ) )
            // InternalSpringConfigDslJava.g:1392:2: ( rule__Component__ClassAssignment_1_4_9 )
            {
             before(grammarAccess.getComponentAccess().getClassAssignment_1_4_9()); 
            // InternalSpringConfigDslJava.g:1393:2: ( rule__Component__ClassAssignment_1_4_9 )
            // InternalSpringConfigDslJava.g:1393:3: rule__Component__ClassAssignment_1_4_9
            {
            pushFollow(FOLLOW_2);
            rule__Component__ClassAssignment_1_4_9();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getClassAssignment_1_4_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__9__Impl"


    // $ANTLR start "rule__Component__Group_1_4__10"
    // InternalSpringConfigDslJava.g:1401:1: rule__Component__Group_1_4__10 : rule__Component__Group_1_4__10__Impl rule__Component__Group_1_4__11 ;
    public final void rule__Component__Group_1_4__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1405:1: ( rule__Component__Group_1_4__10__Impl rule__Component__Group_1_4__11 )
            // InternalSpringConfigDslJava.g:1406:2: rule__Component__Group_1_4__10__Impl rule__Component__Group_1_4__11
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_1_4__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__10"


    // $ANTLR start "rule__Component__Group_1_4__10__Impl"
    // InternalSpringConfigDslJava.g:1413:1: rule__Component__Group_1_4__10__Impl : ( '(' ) ;
    public final void rule__Component__Group_1_4__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1417:1: ( ( '(' ) )
            // InternalSpringConfigDslJava.g:1418:1: ( '(' )
            {
            // InternalSpringConfigDslJava.g:1418:1: ( '(' )
            // InternalSpringConfigDslJava.g:1419:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_4_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_4_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__10__Impl"


    // $ANTLR start "rule__Component__Group_1_4__11"
    // InternalSpringConfigDslJava.g:1428:1: rule__Component__Group_1_4__11 : rule__Component__Group_1_4__11__Impl rule__Component__Group_1_4__12 ;
    public final void rule__Component__Group_1_4__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1432:1: ( rule__Component__Group_1_4__11__Impl rule__Component__Group_1_4__12 )
            // InternalSpringConfigDslJava.g:1433:2: rule__Component__Group_1_4__11__Impl rule__Component__Group_1_4__12
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group_1_4__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__11"


    // $ANTLR start "rule__Component__Group_1_4__11__Impl"
    // InternalSpringConfigDslJava.g:1440:1: rule__Component__Group_1_4__11__Impl : ( ')' ) ;
    public final void rule__Component__Group_1_4__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1444:1: ( ( ')' ) )
            // InternalSpringConfigDslJava.g:1445:1: ( ')' )
            {
            // InternalSpringConfigDslJava.g:1445:1: ( ')' )
            // InternalSpringConfigDslJava.g:1446:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_4_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_4_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__11__Impl"


    // $ANTLR start "rule__Component__Group_1_4__12"
    // InternalSpringConfigDslJava.g:1455:1: rule__Component__Group_1_4__12 : rule__Component__Group_1_4__12__Impl rule__Component__Group_1_4__13 ;
    public final void rule__Component__Group_1_4__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1459:1: ( rule__Component__Group_1_4__12__Impl rule__Component__Group_1_4__13 )
            // InternalSpringConfigDslJava.g:1460:2: rule__Component__Group_1_4__12__Impl rule__Component__Group_1_4__13
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group_1_4__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__12"


    // $ANTLR start "rule__Component__Group_1_4__12__Impl"
    // InternalSpringConfigDslJava.g:1467:1: rule__Component__Group_1_4__12__Impl : ( ruleEOL ) ;
    public final void rule__Component__Group_1_4__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1471:1: ( ( ruleEOL ) )
            // InternalSpringConfigDslJava.g:1472:1: ( ruleEOL )
            {
            // InternalSpringConfigDslJava.g:1472:1: ( ruleEOL )
            // InternalSpringConfigDslJava.g:1473:2: ruleEOL
            {
             before(grammarAccess.getComponentAccess().getEOLParserRuleCall_1_4_12()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getEOLParserRuleCall_1_4_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__12__Impl"


    // $ANTLR start "rule__Component__Group_1_4__13"
    // InternalSpringConfigDslJava.g:1482:1: rule__Component__Group_1_4__13 : rule__Component__Group_1_4__13__Impl ;
    public final void rule__Component__Group_1_4__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1486:1: ( rule__Component__Group_1_4__13__Impl )
            // InternalSpringConfigDslJava.g:1487:2: rule__Component__Group_1_4__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__13"


    // $ANTLR start "rule__Component__Group_1_4__13__Impl"
    // InternalSpringConfigDslJava.g:1493:1: rule__Component__Group_1_4__13__Impl : ( '}' ) ;
    public final void rule__Component__Group_1_4__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1497:1: ( ( '}' ) )
            // InternalSpringConfigDslJava.g:1498:1: ( '}' )
            {
            // InternalSpringConfigDslJava.g:1498:1: ( '}' )
            // InternalSpringConfigDslJava.g:1499:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_1_4_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_1_4_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4__13__Impl"


    // $ANTLR start "rule__Component__Group_1_4_0__0"
    // InternalSpringConfigDslJava.g:1509:1: rule__Component__Group_1_4_0__0 : rule__Component__Group_1_4_0__0__Impl rule__Component__Group_1_4_0__1 ;
    public final void rule__Component__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1513:1: ( rule__Component__Group_1_4_0__0__Impl rule__Component__Group_1_4_0__1 )
            // InternalSpringConfigDslJava.g:1514:2: rule__Component__Group_1_4_0__0__Impl rule__Component__Group_1_4_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group_1_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4_0__0"


    // $ANTLR start "rule__Component__Group_1_4_0__0__Impl"
    // InternalSpringConfigDslJava.g:1521:1: rule__Component__Group_1_4_0__0__Impl : ( '@Qualifier' ) ;
    public final void rule__Component__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1525:1: ( ( '@Qualifier' ) )
            // InternalSpringConfigDslJava.g:1526:1: ( '@Qualifier' )
            {
            // InternalSpringConfigDslJava.g:1526:1: ( '@Qualifier' )
            // InternalSpringConfigDslJava.g:1527:2: '@Qualifier'
            {
             before(grammarAccess.getComponentAccess().getQualifierKeyword_1_4_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getQualifierKeyword_1_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4_0__0__Impl"


    // $ANTLR start "rule__Component__Group_1_4_0__1"
    // InternalSpringConfigDslJava.g:1536:1: rule__Component__Group_1_4_0__1 : rule__Component__Group_1_4_0__1__Impl rule__Component__Group_1_4_0__2 ;
    public final void rule__Component__Group_1_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1540:1: ( rule__Component__Group_1_4_0__1__Impl rule__Component__Group_1_4_0__2 )
            // InternalSpringConfigDslJava.g:1541:2: rule__Component__Group_1_4_0__1__Impl rule__Component__Group_1_4_0__2
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group_1_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4_0__1"


    // $ANTLR start "rule__Component__Group_1_4_0__1__Impl"
    // InternalSpringConfigDslJava.g:1548:1: rule__Component__Group_1_4_0__1__Impl : ( '(' ) ;
    public final void rule__Component__Group_1_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1552:1: ( ( '(' ) )
            // InternalSpringConfigDslJava.g:1553:1: ( '(' )
            {
            // InternalSpringConfigDslJava.g:1553:1: ( '(' )
            // InternalSpringConfigDslJava.g:1554:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_4_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4_0__1__Impl"


    // $ANTLR start "rule__Component__Group_1_4_0__2"
    // InternalSpringConfigDslJava.g:1563:1: rule__Component__Group_1_4_0__2 : rule__Component__Group_1_4_0__2__Impl rule__Component__Group_1_4_0__3 ;
    public final void rule__Component__Group_1_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1567:1: ( rule__Component__Group_1_4_0__2__Impl rule__Component__Group_1_4_0__3 )
            // InternalSpringConfigDslJava.g:1568:2: rule__Component__Group_1_4_0__2__Impl rule__Component__Group_1_4_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_1_4_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4_0__2"


    // $ANTLR start "rule__Component__Group_1_4_0__2__Impl"
    // InternalSpringConfigDslJava.g:1575:1: rule__Component__Group_1_4_0__2__Impl : ( ( rule__Component__QualifierAssignment_1_4_0_2 ) ) ;
    public final void rule__Component__Group_1_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1579:1: ( ( ( rule__Component__QualifierAssignment_1_4_0_2 ) ) )
            // InternalSpringConfigDslJava.g:1580:1: ( ( rule__Component__QualifierAssignment_1_4_0_2 ) )
            {
            // InternalSpringConfigDslJava.g:1580:1: ( ( rule__Component__QualifierAssignment_1_4_0_2 ) )
            // InternalSpringConfigDslJava.g:1581:2: ( rule__Component__QualifierAssignment_1_4_0_2 )
            {
             before(grammarAccess.getComponentAccess().getQualifierAssignment_1_4_0_2()); 
            // InternalSpringConfigDslJava.g:1582:2: ( rule__Component__QualifierAssignment_1_4_0_2 )
            // InternalSpringConfigDslJava.g:1582:3: rule__Component__QualifierAssignment_1_4_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__QualifierAssignment_1_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getQualifierAssignment_1_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4_0__2__Impl"


    // $ANTLR start "rule__Component__Group_1_4_0__3"
    // InternalSpringConfigDslJava.g:1590:1: rule__Component__Group_1_4_0__3 : rule__Component__Group_1_4_0__3__Impl ;
    public final void rule__Component__Group_1_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1594:1: ( rule__Component__Group_1_4_0__3__Impl )
            // InternalSpringConfigDslJava.g:1595:2: rule__Component__Group_1_4_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_1_4_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4_0__3"


    // $ANTLR start "rule__Component__Group_1_4_0__3__Impl"
    // InternalSpringConfigDslJava.g:1601:1: rule__Component__Group_1_4_0__3__Impl : ( ')' ) ;
    public final void rule__Component__Group_1_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1605:1: ( ( ')' ) )
            // InternalSpringConfigDslJava.g:1606:1: ( ')' )
            {
            // InternalSpringConfigDslJava.g:1606:1: ( ')' )
            // InternalSpringConfigDslJava.g:1607:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_4_0_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_4_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_4_0__3__Impl"


    // $ANTLR start "rule__AnnotationConfiguration__Group__0"
    // InternalSpringConfigDslJava.g:1617:1: rule__AnnotationConfiguration__Group__0 : rule__AnnotationConfiguration__Group__0__Impl rule__AnnotationConfiguration__Group__1 ;
    public final void rule__AnnotationConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1621:1: ( rule__AnnotationConfiguration__Group__0__Impl rule__AnnotationConfiguration__Group__1 )
            // InternalSpringConfigDslJava.g:1622:2: rule__AnnotationConfiguration__Group__0__Impl rule__AnnotationConfiguration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AnnotationConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__Group__0"


    // $ANTLR start "rule__AnnotationConfiguration__Group__0__Impl"
    // InternalSpringConfigDslJava.g:1629:1: rule__AnnotationConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__AnnotationConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1633:1: ( ( () ) )
            // InternalSpringConfigDslJava.g:1634:1: ( () )
            {
            // InternalSpringConfigDslJava.g:1634:1: ( () )
            // InternalSpringConfigDslJava.g:1635:2: ()
            {
             before(grammarAccess.getAnnotationConfigurationAccess().getAnnotationConfigurationAction_0()); 
            // InternalSpringConfigDslJava.g:1636:2: ()
            // InternalSpringConfigDslJava.g:1636:3: 
            {
            }

             after(grammarAccess.getAnnotationConfigurationAccess().getAnnotationConfigurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__Group__0__Impl"


    // $ANTLR start "rule__AnnotationConfiguration__Group__1"
    // InternalSpringConfigDslJava.g:1644:1: rule__AnnotationConfiguration__Group__1 : rule__AnnotationConfiguration__Group__1__Impl ;
    public final void rule__AnnotationConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1648:1: ( rule__AnnotationConfiguration__Group__1__Impl )
            // InternalSpringConfigDslJava.g:1649:2: rule__AnnotationConfiguration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationConfiguration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__Group__1"


    // $ANTLR start "rule__AnnotationConfiguration__Group__1__Impl"
    // InternalSpringConfigDslJava.g:1655:1: rule__AnnotationConfiguration__Group__1__Impl : ( ( rule__AnnotationConfiguration__Group_1__0 ) ) ;
    public final void rule__AnnotationConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1659:1: ( ( ( rule__AnnotationConfiguration__Group_1__0 ) ) )
            // InternalSpringConfigDslJava.g:1660:1: ( ( rule__AnnotationConfiguration__Group_1__0 ) )
            {
            // InternalSpringConfigDslJava.g:1660:1: ( ( rule__AnnotationConfiguration__Group_1__0 ) )
            // InternalSpringConfigDslJava.g:1661:2: ( rule__AnnotationConfiguration__Group_1__0 )
            {
             before(grammarAccess.getAnnotationConfigurationAccess().getGroup_1()); 
            // InternalSpringConfigDslJava.g:1662:2: ( rule__AnnotationConfiguration__Group_1__0 )
            // InternalSpringConfigDslJava.g:1662:3: rule__AnnotationConfiguration__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationConfiguration__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationConfigurationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__Group__1__Impl"


    // $ANTLR start "rule__AnnotationConfiguration__Group_1__0"
    // InternalSpringConfigDslJava.g:1671:1: rule__AnnotationConfiguration__Group_1__0 : rule__AnnotationConfiguration__Group_1__0__Impl rule__AnnotationConfiguration__Group_1__1 ;
    public final void rule__AnnotationConfiguration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1675:1: ( rule__AnnotationConfiguration__Group_1__0__Impl rule__AnnotationConfiguration__Group_1__1 )
            // InternalSpringConfigDslJava.g:1676:2: rule__AnnotationConfiguration__Group_1__0__Impl rule__AnnotationConfiguration__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__AnnotationConfiguration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationConfiguration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__Group_1__0"


    // $ANTLR start "rule__AnnotationConfiguration__Group_1__0__Impl"
    // InternalSpringConfigDslJava.g:1683:1: rule__AnnotationConfiguration__Group_1__0__Impl : ( '@Configuration' ) ;
    public final void rule__AnnotationConfiguration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1687:1: ( ( '@Configuration' ) )
            // InternalSpringConfigDslJava.g:1688:1: ( '@Configuration' )
            {
            // InternalSpringConfigDslJava.g:1688:1: ( '@Configuration' )
            // InternalSpringConfigDslJava.g:1689:2: '@Configuration'
            {
             before(grammarAccess.getAnnotationConfigurationAccess().getConfigurationKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAnnotationConfigurationAccess().getConfigurationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__Group_1__0__Impl"


    // $ANTLR start "rule__AnnotationConfiguration__Group_1__1"
    // InternalSpringConfigDslJava.g:1698:1: rule__AnnotationConfiguration__Group_1__1 : rule__AnnotationConfiguration__Group_1__1__Impl ;
    public final void rule__AnnotationConfiguration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1702:1: ( rule__AnnotationConfiguration__Group_1__1__Impl )
            // InternalSpringConfigDslJava.g:1703:2: rule__AnnotationConfiguration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationConfiguration__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__Group_1__1"


    // $ANTLR start "rule__AnnotationConfiguration__Group_1__1__Impl"
    // InternalSpringConfigDslJava.g:1709:1: rule__AnnotationConfiguration__Group_1__1__Impl : ( ( rule__AnnotationConfiguration__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__AnnotationConfiguration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1713:1: ( ( ( rule__AnnotationConfiguration__AnnotationsAssignment_1_1 )* ) )
            // InternalSpringConfigDslJava.g:1714:1: ( ( rule__AnnotationConfiguration__AnnotationsAssignment_1_1 )* )
            {
            // InternalSpringConfigDslJava.g:1714:1: ( ( rule__AnnotationConfiguration__AnnotationsAssignment_1_1 )* )
            // InternalSpringConfigDslJava.g:1715:2: ( rule__AnnotationConfiguration__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getAnnotationConfigurationAccess().getAnnotationsAssignment_1_1()); 
            // InternalSpringConfigDslJava.g:1716:2: ( rule__AnnotationConfiguration__AnnotationsAssignment_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSpringConfigDslJava.g:1716:3: rule__AnnotationConfiguration__AnnotationsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AnnotationConfiguration__AnnotationsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAnnotationConfigurationAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__Group_1__1__Impl"


    // $ANTLR start "rule__ImportAnnotations__Group_0__0"
    // InternalSpringConfigDslJava.g:1725:1: rule__ImportAnnotations__Group_0__0 : rule__ImportAnnotations__Group_0__0__Impl rule__ImportAnnotations__Group_0__1 ;
    public final void rule__ImportAnnotations__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1729:1: ( rule__ImportAnnotations__Group_0__0__Impl rule__ImportAnnotations__Group_0__1 )
            // InternalSpringConfigDslJava.g:1730:2: rule__ImportAnnotations__Group_0__0__Impl rule__ImportAnnotations__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__ImportAnnotations__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_0__0"


    // $ANTLR start "rule__ImportAnnotations__Group_0__0__Impl"
    // InternalSpringConfigDslJava.g:1737:1: rule__ImportAnnotations__Group_0__0__Impl : ( '@Import' ) ;
    public final void rule__ImportAnnotations__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1741:1: ( ( '@Import' ) )
            // InternalSpringConfigDslJava.g:1742:1: ( '@Import' )
            {
            // InternalSpringConfigDslJava.g:1742:1: ( '@Import' )
            // InternalSpringConfigDslJava.g:1743:2: '@Import'
            {
             before(grammarAccess.getImportAnnotationsAccess().getImportKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getImportAnnotationsAccess().getImportKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_0__0__Impl"


    // $ANTLR start "rule__ImportAnnotations__Group_0__1"
    // InternalSpringConfigDslJava.g:1752:1: rule__ImportAnnotations__Group_0__1 : rule__ImportAnnotations__Group_0__1__Impl rule__ImportAnnotations__Group_0__2 ;
    public final void rule__ImportAnnotations__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1756:1: ( rule__ImportAnnotations__Group_0__1__Impl rule__ImportAnnotations__Group_0__2 )
            // InternalSpringConfigDslJava.g:1757:2: rule__ImportAnnotations__Group_0__1__Impl rule__ImportAnnotations__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__ImportAnnotations__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_0__1"


    // $ANTLR start "rule__ImportAnnotations__Group_0__1__Impl"
    // InternalSpringConfigDslJava.g:1764:1: rule__ImportAnnotations__Group_0__1__Impl : ( '(' ) ;
    public final void rule__ImportAnnotations__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1768:1: ( ( '(' ) )
            // InternalSpringConfigDslJava.g:1769:1: ( '(' )
            {
            // InternalSpringConfigDslJava.g:1769:1: ( '(' )
            // InternalSpringConfigDslJava.g:1770:2: '('
            {
             before(grammarAccess.getImportAnnotationsAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImportAnnotationsAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_0__1__Impl"


    // $ANTLR start "rule__ImportAnnotations__Group_0__2"
    // InternalSpringConfigDslJava.g:1779:1: rule__ImportAnnotations__Group_0__2 : rule__ImportAnnotations__Group_0__2__Impl rule__ImportAnnotations__Group_0__3 ;
    public final void rule__ImportAnnotations__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1783:1: ( rule__ImportAnnotations__Group_0__2__Impl rule__ImportAnnotations__Group_0__3 )
            // InternalSpringConfigDslJava.g:1784:2: rule__ImportAnnotations__Group_0__2__Impl rule__ImportAnnotations__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__ImportAnnotations__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_0__2"


    // $ANTLR start "rule__ImportAnnotations__Group_0__2__Impl"
    // InternalSpringConfigDslJava.g:1791:1: rule__ImportAnnotations__Group_0__2__Impl : ( ruleImportFormatRules ) ;
    public final void rule__ImportAnnotations__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1795:1: ( ( ruleImportFormatRules ) )
            // InternalSpringConfigDslJava.g:1796:1: ( ruleImportFormatRules )
            {
            // InternalSpringConfigDslJava.g:1796:1: ( ruleImportFormatRules )
            // InternalSpringConfigDslJava.g:1797:2: ruleImportFormatRules
            {
             before(grammarAccess.getImportAnnotationsAccess().getImportFormatRulesParserRuleCall_0_2()); 
            pushFollow(FOLLOW_2);
            ruleImportFormatRules();

            state._fsp--;

             after(grammarAccess.getImportAnnotationsAccess().getImportFormatRulesParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_0__2__Impl"


    // $ANTLR start "rule__ImportAnnotations__Group_0__3"
    // InternalSpringConfigDslJava.g:1806:1: rule__ImportAnnotations__Group_0__3 : rule__ImportAnnotations__Group_0__3__Impl ;
    public final void rule__ImportAnnotations__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1810:1: ( rule__ImportAnnotations__Group_0__3__Impl )
            // InternalSpringConfigDslJava.g:1811:2: rule__ImportAnnotations__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_0__3"


    // $ANTLR start "rule__ImportAnnotations__Group_0__3__Impl"
    // InternalSpringConfigDslJava.g:1817:1: rule__ImportAnnotations__Group_0__3__Impl : ( ')' ) ;
    public final void rule__ImportAnnotations__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1821:1: ( ( ')' ) )
            // InternalSpringConfigDslJava.g:1822:1: ( ')' )
            {
            // InternalSpringConfigDslJava.g:1822:1: ( ')' )
            // InternalSpringConfigDslJava.g:1823:2: ')'
            {
             before(grammarAccess.getImportAnnotationsAccess().getRightParenthesisKeyword_0_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportAnnotationsAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_0__3__Impl"


    // $ANTLR start "rule__ImportAnnotations__Group_1__0"
    // InternalSpringConfigDslJava.g:1833:1: rule__ImportAnnotations__Group_1__0 : rule__ImportAnnotations__Group_1__0__Impl rule__ImportAnnotations__Group_1__1 ;
    public final void rule__ImportAnnotations__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1837:1: ( rule__ImportAnnotations__Group_1__0__Impl rule__ImportAnnotations__Group_1__1 )
            // InternalSpringConfigDslJava.g:1838:2: rule__ImportAnnotations__Group_1__0__Impl rule__ImportAnnotations__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ImportAnnotations__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_1__0"


    // $ANTLR start "rule__ImportAnnotations__Group_1__0__Impl"
    // InternalSpringConfigDslJava.g:1845:1: rule__ImportAnnotations__Group_1__0__Impl : ( '@ImportRessource' ) ;
    public final void rule__ImportAnnotations__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1849:1: ( ( '@ImportRessource' ) )
            // InternalSpringConfigDslJava.g:1850:1: ( '@ImportRessource' )
            {
            // InternalSpringConfigDslJava.g:1850:1: ( '@ImportRessource' )
            // InternalSpringConfigDslJava.g:1851:2: '@ImportRessource'
            {
             before(grammarAccess.getImportAnnotationsAccess().getImportRessourceKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getImportAnnotationsAccess().getImportRessourceKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_1__0__Impl"


    // $ANTLR start "rule__ImportAnnotations__Group_1__1"
    // InternalSpringConfigDslJava.g:1860:1: rule__ImportAnnotations__Group_1__1 : rule__ImportAnnotations__Group_1__1__Impl rule__ImportAnnotations__Group_1__2 ;
    public final void rule__ImportAnnotations__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1864:1: ( rule__ImportAnnotations__Group_1__1__Impl rule__ImportAnnotations__Group_1__2 )
            // InternalSpringConfigDslJava.g:1865:2: rule__ImportAnnotations__Group_1__1__Impl rule__ImportAnnotations__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ImportAnnotations__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_1__1"


    // $ANTLR start "rule__ImportAnnotations__Group_1__1__Impl"
    // InternalSpringConfigDslJava.g:1872:1: rule__ImportAnnotations__Group_1__1__Impl : ( '(' ) ;
    public final void rule__ImportAnnotations__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1876:1: ( ( '(' ) )
            // InternalSpringConfigDslJava.g:1877:1: ( '(' )
            {
            // InternalSpringConfigDslJava.g:1877:1: ( '(' )
            // InternalSpringConfigDslJava.g:1878:2: '('
            {
             before(grammarAccess.getImportAnnotationsAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImportAnnotationsAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_1__1__Impl"


    // $ANTLR start "rule__ImportAnnotations__Group_1__2"
    // InternalSpringConfigDslJava.g:1887:1: rule__ImportAnnotations__Group_1__2 : rule__ImportAnnotations__Group_1__2__Impl rule__ImportAnnotations__Group_1__3 ;
    public final void rule__ImportAnnotations__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1891:1: ( rule__ImportAnnotations__Group_1__2__Impl rule__ImportAnnotations__Group_1__3 )
            // InternalSpringConfigDslJava.g:1892:2: rule__ImportAnnotations__Group_1__2__Impl rule__ImportAnnotations__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__ImportAnnotations__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_1__2"


    // $ANTLR start "rule__ImportAnnotations__Group_1__2__Impl"
    // InternalSpringConfigDslJava.g:1899:1: rule__ImportAnnotations__Group_1__2__Impl : ( ruleImportFormatRules ) ;
    public final void rule__ImportAnnotations__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1903:1: ( ( ruleImportFormatRules ) )
            // InternalSpringConfigDslJava.g:1904:1: ( ruleImportFormatRules )
            {
            // InternalSpringConfigDslJava.g:1904:1: ( ruleImportFormatRules )
            // InternalSpringConfigDslJava.g:1905:2: ruleImportFormatRules
            {
             before(grammarAccess.getImportAnnotationsAccess().getImportFormatRulesParserRuleCall_1_2()); 
            pushFollow(FOLLOW_2);
            ruleImportFormatRules();

            state._fsp--;

             after(grammarAccess.getImportAnnotationsAccess().getImportFormatRulesParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_1__2__Impl"


    // $ANTLR start "rule__ImportAnnotations__Group_1__3"
    // InternalSpringConfigDslJava.g:1914:1: rule__ImportAnnotations__Group_1__3 : rule__ImportAnnotations__Group_1__3__Impl ;
    public final void rule__ImportAnnotations__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1918:1: ( rule__ImportAnnotations__Group_1__3__Impl )
            // InternalSpringConfigDslJava.g:1919:2: rule__ImportAnnotations__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportAnnotations__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_1__3"


    // $ANTLR start "rule__ImportAnnotations__Group_1__3__Impl"
    // InternalSpringConfigDslJava.g:1925:1: rule__ImportAnnotations__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ImportAnnotations__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1929:1: ( ( ')' ) )
            // InternalSpringConfigDslJava.g:1930:1: ( ')' )
            {
            // InternalSpringConfigDslJava.g:1930:1: ( ')' )
            // InternalSpringConfigDslJava.g:1931:2: ')'
            {
             before(grammarAccess.getImportAnnotationsAccess().getRightParenthesisKeyword_1_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportAnnotationsAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAnnotations__Group_1__3__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_0__0"
    // InternalSpringConfigDslJava.g:1941:1: rule__ImportFormatRules__Group_0__0 : rule__ImportFormatRules__Group_0__0__Impl rule__ImportFormatRules__Group_0__1 ;
    public final void rule__ImportFormatRules__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1945:1: ( rule__ImportFormatRules__Group_0__0__Impl rule__ImportFormatRules__Group_0__1 )
            // InternalSpringConfigDslJava.g:1946:2: rule__ImportFormatRules__Group_0__0__Impl rule__ImportFormatRules__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ImportFormatRules__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_0__0"


    // $ANTLR start "rule__ImportFormatRules__Group_0__0__Impl"
    // InternalSpringConfigDslJava.g:1953:1: rule__ImportFormatRules__Group_0__0__Impl : ( '{' ) ;
    public final void rule__ImportFormatRules__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1957:1: ( ( '{' ) )
            // InternalSpringConfigDslJava.g:1958:1: ( '{' )
            {
            // InternalSpringConfigDslJava.g:1958:1: ( '{' )
            // InternalSpringConfigDslJava.g:1959:2: '{'
            {
             before(grammarAccess.getImportFormatRulesAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportFormatRulesAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_0__0__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_0__1"
    // InternalSpringConfigDslJava.g:1968:1: rule__ImportFormatRules__Group_0__1 : rule__ImportFormatRules__Group_0__1__Impl rule__ImportFormatRules__Group_0__2 ;
    public final void rule__ImportFormatRules__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1972:1: ( rule__ImportFormatRules__Group_0__1__Impl rule__ImportFormatRules__Group_0__2 )
            // InternalSpringConfigDslJava.g:1973:2: rule__ImportFormatRules__Group_0__1__Impl rule__ImportFormatRules__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__ImportFormatRules__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_0__1"


    // $ANTLR start "rule__ImportFormatRules__Group_0__1__Impl"
    // InternalSpringConfigDslJava.g:1980:1: rule__ImportFormatRules__Group_0__1__Impl : ( ruleClassFileExtensions ) ;
    public final void rule__ImportFormatRules__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1984:1: ( ( ruleClassFileExtensions ) )
            // InternalSpringConfigDslJava.g:1985:1: ( ruleClassFileExtensions )
            {
            // InternalSpringConfigDslJava.g:1985:1: ( ruleClassFileExtensions )
            // InternalSpringConfigDslJava.g:1986:2: ruleClassFileExtensions
            {
             before(grammarAccess.getImportFormatRulesAccess().getClassFileExtensionsParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleClassFileExtensions();

            state._fsp--;

             after(grammarAccess.getImportFormatRulesAccess().getClassFileExtensionsParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_0__1__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_0__2"
    // InternalSpringConfigDslJava.g:1995:1: rule__ImportFormatRules__Group_0__2 : rule__ImportFormatRules__Group_0__2__Impl ;
    public final void rule__ImportFormatRules__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:1999:1: ( rule__ImportFormatRules__Group_0__2__Impl )
            // InternalSpringConfigDslJava.g:2000:2: rule__ImportFormatRules__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_0__2"


    // $ANTLR start "rule__ImportFormatRules__Group_0__2__Impl"
    // InternalSpringConfigDslJava.g:2006:1: rule__ImportFormatRules__Group_0__2__Impl : ( '}' ) ;
    public final void rule__ImportFormatRules__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2010:1: ( ( '}' ) )
            // InternalSpringConfigDslJava.g:2011:1: ( '}' )
            {
            // InternalSpringConfigDslJava.g:2011:1: ( '}' )
            // InternalSpringConfigDslJava.g:2012:2: '}'
            {
             before(grammarAccess.getImportFormatRulesAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportFormatRulesAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_0__2__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_1_0__0"
    // InternalSpringConfigDslJava.g:2022:1: rule__ImportFormatRules__Group_1_0__0 : rule__ImportFormatRules__Group_1_0__0__Impl rule__ImportFormatRules__Group_1_0__1 ;
    public final void rule__ImportFormatRules__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2026:1: ( rule__ImportFormatRules__Group_1_0__0__Impl rule__ImportFormatRules__Group_1_0__1 )
            // InternalSpringConfigDslJava.g:2027:2: rule__ImportFormatRules__Group_1_0__0__Impl rule__ImportFormatRules__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ImportFormatRules__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_0__0"


    // $ANTLR start "rule__ImportFormatRules__Group_1_0__0__Impl"
    // InternalSpringConfigDslJava.g:2034:1: rule__ImportFormatRules__Group_1_0__0__Impl : ( 'value=' ) ;
    public final void rule__ImportFormatRules__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2038:1: ( ( 'value=' ) )
            // InternalSpringConfigDslJava.g:2039:1: ( 'value=' )
            {
            // InternalSpringConfigDslJava.g:2039:1: ( 'value=' )
            // InternalSpringConfigDslJava.g:2040:2: 'value='
            {
             before(grammarAccess.getImportFormatRulesAccess().getValueKeyword_1_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getImportFormatRulesAccess().getValueKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_0__0__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_1_0__1"
    // InternalSpringConfigDslJava.g:2049:1: rule__ImportFormatRules__Group_1_0__1 : rule__ImportFormatRules__Group_1_0__1__Impl rule__ImportFormatRules__Group_1_0__2 ;
    public final void rule__ImportFormatRules__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2053:1: ( rule__ImportFormatRules__Group_1_0__1__Impl rule__ImportFormatRules__Group_1_0__2 )
            // InternalSpringConfigDslJava.g:2054:2: rule__ImportFormatRules__Group_1_0__1__Impl rule__ImportFormatRules__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__ImportFormatRules__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_0__1"


    // $ANTLR start "rule__ImportFormatRules__Group_1_0__1__Impl"
    // InternalSpringConfigDslJava.g:2061:1: rule__ImportFormatRules__Group_1_0__1__Impl : ( '{' ) ;
    public final void rule__ImportFormatRules__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2065:1: ( ( '{' ) )
            // InternalSpringConfigDslJava.g:2066:1: ( '{' )
            {
            // InternalSpringConfigDslJava.g:2066:1: ( '{' )
            // InternalSpringConfigDslJava.g:2067:2: '{'
            {
             before(grammarAccess.getImportFormatRulesAccess().getLeftCurlyBracketKeyword_1_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportFormatRulesAccess().getLeftCurlyBracketKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_0__1__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_1_0__2"
    // InternalSpringConfigDslJava.g:2076:1: rule__ImportFormatRules__Group_1_0__2 : rule__ImportFormatRules__Group_1_0__2__Impl rule__ImportFormatRules__Group_1_0__3 ;
    public final void rule__ImportFormatRules__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2080:1: ( rule__ImportFormatRules__Group_1_0__2__Impl rule__ImportFormatRules__Group_1_0__3 )
            // InternalSpringConfigDslJava.g:2081:2: rule__ImportFormatRules__Group_1_0__2__Impl rule__ImportFormatRules__Group_1_0__3
            {
            pushFollow(FOLLOW_8);
            rule__ImportFormatRules__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_0__2"


    // $ANTLR start "rule__ImportFormatRules__Group_1_0__2__Impl"
    // InternalSpringConfigDslJava.g:2088:1: rule__ImportFormatRules__Group_1_0__2__Impl : ( ruleClassFileExtensions ) ;
    public final void rule__ImportFormatRules__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2092:1: ( ( ruleClassFileExtensions ) )
            // InternalSpringConfigDslJava.g:2093:1: ( ruleClassFileExtensions )
            {
            // InternalSpringConfigDslJava.g:2093:1: ( ruleClassFileExtensions )
            // InternalSpringConfigDslJava.g:2094:2: ruleClassFileExtensions
            {
             before(grammarAccess.getImportFormatRulesAccess().getClassFileExtensionsParserRuleCall_1_0_2()); 
            pushFollow(FOLLOW_2);
            ruleClassFileExtensions();

            state._fsp--;

             after(grammarAccess.getImportFormatRulesAccess().getClassFileExtensionsParserRuleCall_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_0__2__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_1_0__3"
    // InternalSpringConfigDslJava.g:2103:1: rule__ImportFormatRules__Group_1_0__3 : rule__ImportFormatRules__Group_1_0__3__Impl ;
    public final void rule__ImportFormatRules__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2107:1: ( rule__ImportFormatRules__Group_1_0__3__Impl )
            // InternalSpringConfigDslJava.g:2108:2: rule__ImportFormatRules__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_0__3"


    // $ANTLR start "rule__ImportFormatRules__Group_1_0__3__Impl"
    // InternalSpringConfigDslJava.g:2114:1: rule__ImportFormatRules__Group_1_0__3__Impl : ( '}' ) ;
    public final void rule__ImportFormatRules__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2118:1: ( ( '}' ) )
            // InternalSpringConfigDslJava.g:2119:1: ( '}' )
            {
            // InternalSpringConfigDslJava.g:2119:1: ( '}' )
            // InternalSpringConfigDslJava.g:2120:2: '}'
            {
             before(grammarAccess.getImportFormatRulesAccess().getRightCurlyBracketKeyword_1_0_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportFormatRulesAccess().getRightCurlyBracketKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_0__3__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_1_1__0"
    // InternalSpringConfigDslJava.g:2130:1: rule__ImportFormatRules__Group_1_1__0 : rule__ImportFormatRules__Group_1_1__0__Impl rule__ImportFormatRules__Group_1_1__1 ;
    public final void rule__ImportFormatRules__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2134:1: ( rule__ImportFormatRules__Group_1_1__0__Impl rule__ImportFormatRules__Group_1_1__1 )
            // InternalSpringConfigDslJava.g:2135:2: rule__ImportFormatRules__Group_1_1__0__Impl rule__ImportFormatRules__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ImportFormatRules__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_1__0"


    // $ANTLR start "rule__ImportFormatRules__Group_1_1__0__Impl"
    // InternalSpringConfigDslJava.g:2142:1: rule__ImportFormatRules__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__ImportFormatRules__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2146:1: ( ( '{' ) )
            // InternalSpringConfigDslJava.g:2147:1: ( '{' )
            {
            // InternalSpringConfigDslJava.g:2147:1: ( '{' )
            // InternalSpringConfigDslJava.g:2148:2: '{'
            {
             before(grammarAccess.getImportFormatRulesAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportFormatRulesAccess().getLeftCurlyBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_1__0__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_1_1__1"
    // InternalSpringConfigDslJava.g:2157:1: rule__ImportFormatRules__Group_1_1__1 : rule__ImportFormatRules__Group_1_1__1__Impl rule__ImportFormatRules__Group_1_1__2 ;
    public final void rule__ImportFormatRules__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2161:1: ( rule__ImportFormatRules__Group_1_1__1__Impl rule__ImportFormatRules__Group_1_1__2 )
            // InternalSpringConfigDslJava.g:2162:2: rule__ImportFormatRules__Group_1_1__1__Impl rule__ImportFormatRules__Group_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ImportFormatRules__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_1__1"


    // $ANTLR start "rule__ImportFormatRules__Group_1_1__1__Impl"
    // InternalSpringConfigDslJava.g:2169:1: rule__ImportFormatRules__Group_1_1__1__Impl : ( ruleStringList ) ;
    public final void rule__ImportFormatRules__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2173:1: ( ( ruleStringList ) )
            // InternalSpringConfigDslJava.g:2174:1: ( ruleStringList )
            {
            // InternalSpringConfigDslJava.g:2174:1: ( ruleStringList )
            // InternalSpringConfigDslJava.g:2175:2: ruleStringList
            {
             before(grammarAccess.getImportFormatRulesAccess().getStringListParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getImportFormatRulesAccess().getStringListParserRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_1__1__Impl"


    // $ANTLR start "rule__ImportFormatRules__Group_1_1__2"
    // InternalSpringConfigDslJava.g:2184:1: rule__ImportFormatRules__Group_1_1__2 : rule__ImportFormatRules__Group_1_1__2__Impl ;
    public final void rule__ImportFormatRules__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2188:1: ( rule__ImportFormatRules__Group_1_1__2__Impl )
            // InternalSpringConfigDslJava.g:2189:2: rule__ImportFormatRules__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportFormatRules__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_1__2"


    // $ANTLR start "rule__ImportFormatRules__Group_1_1__2__Impl"
    // InternalSpringConfigDslJava.g:2195:1: rule__ImportFormatRules__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__ImportFormatRules__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2199:1: ( ( '}' ) )
            // InternalSpringConfigDslJava.g:2200:1: ( '}' )
            {
            // InternalSpringConfigDslJava.g:2200:1: ( '}' )
            // InternalSpringConfigDslJava.g:2201:2: '}'
            {
             before(grammarAccess.getImportFormatRulesAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportFormatRulesAccess().getRightCurlyBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportFormatRules__Group_1_1__2__Impl"


    // $ANTLR start "rule__StringListAnnotation__Group_0__0"
    // InternalSpringConfigDslJava.g:2211:1: rule__StringListAnnotation__Group_0__0 : rule__StringListAnnotation__Group_0__0__Impl rule__StringListAnnotation__Group_0__1 ;
    public final void rule__StringListAnnotation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2215:1: ( rule__StringListAnnotation__Group_0__0__Impl rule__StringListAnnotation__Group_0__1 )
            // InternalSpringConfigDslJava.g:2216:2: rule__StringListAnnotation__Group_0__0__Impl rule__StringListAnnotation__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__StringListAnnotation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringListAnnotation__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_0__0"


    // $ANTLR start "rule__StringListAnnotation__Group_0__0__Impl"
    // InternalSpringConfigDslJava.g:2223:1: rule__StringListAnnotation__Group_0__0__Impl : ( '{' ) ;
    public final void rule__StringListAnnotation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2227:1: ( ( '{' ) )
            // InternalSpringConfigDslJava.g:2228:1: ( '{' )
            {
            // InternalSpringConfigDslJava.g:2228:1: ( '{' )
            // InternalSpringConfigDslJava.g:2229:2: '{'
            {
             before(grammarAccess.getStringListAnnotationAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStringListAnnotationAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_0__0__Impl"


    // $ANTLR start "rule__StringListAnnotation__Group_0__1"
    // InternalSpringConfigDslJava.g:2238:1: rule__StringListAnnotation__Group_0__1 : rule__StringListAnnotation__Group_0__1__Impl rule__StringListAnnotation__Group_0__2 ;
    public final void rule__StringListAnnotation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2242:1: ( rule__StringListAnnotation__Group_0__1__Impl rule__StringListAnnotation__Group_0__2 )
            // InternalSpringConfigDslJava.g:2243:2: rule__StringListAnnotation__Group_0__1__Impl rule__StringListAnnotation__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__StringListAnnotation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringListAnnotation__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_0__1"


    // $ANTLR start "rule__StringListAnnotation__Group_0__1__Impl"
    // InternalSpringConfigDslJava.g:2250:1: rule__StringListAnnotation__Group_0__1__Impl : ( ruleStringList ) ;
    public final void rule__StringListAnnotation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2254:1: ( ( ruleStringList ) )
            // InternalSpringConfigDslJava.g:2255:1: ( ruleStringList )
            {
            // InternalSpringConfigDslJava.g:2255:1: ( ruleStringList )
            // InternalSpringConfigDslJava.g:2256:2: ruleStringList
            {
             before(grammarAccess.getStringListAnnotationAccess().getStringListParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListAnnotationAccess().getStringListParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_0__1__Impl"


    // $ANTLR start "rule__StringListAnnotation__Group_0__2"
    // InternalSpringConfigDslJava.g:2265:1: rule__StringListAnnotation__Group_0__2 : rule__StringListAnnotation__Group_0__2__Impl ;
    public final void rule__StringListAnnotation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2269:1: ( rule__StringListAnnotation__Group_0__2__Impl )
            // InternalSpringConfigDslJava.g:2270:2: rule__StringListAnnotation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringListAnnotation__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_0__2"


    // $ANTLR start "rule__StringListAnnotation__Group_0__2__Impl"
    // InternalSpringConfigDslJava.g:2276:1: rule__StringListAnnotation__Group_0__2__Impl : ( '}' ) ;
    public final void rule__StringListAnnotation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2280:1: ( ( '}' ) )
            // InternalSpringConfigDslJava.g:2281:1: ( '}' )
            {
            // InternalSpringConfigDslJava.g:2281:1: ( '}' )
            // InternalSpringConfigDslJava.g:2282:2: '}'
            {
             before(grammarAccess.getStringListAnnotationAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStringListAnnotationAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_0__2__Impl"


    // $ANTLR start "rule__StringListAnnotation__Group_1__0"
    // InternalSpringConfigDslJava.g:2292:1: rule__StringListAnnotation__Group_1__0 : rule__StringListAnnotation__Group_1__0__Impl rule__StringListAnnotation__Group_1__1 ;
    public final void rule__StringListAnnotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2296:1: ( rule__StringListAnnotation__Group_1__0__Impl rule__StringListAnnotation__Group_1__1 )
            // InternalSpringConfigDslJava.g:2297:2: rule__StringListAnnotation__Group_1__0__Impl rule__StringListAnnotation__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__StringListAnnotation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringListAnnotation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_1__0"


    // $ANTLR start "rule__StringListAnnotation__Group_1__0__Impl"
    // InternalSpringConfigDslJava.g:2304:1: rule__StringListAnnotation__Group_1__0__Impl : ( 'value=' ) ;
    public final void rule__StringListAnnotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2308:1: ( ( 'value=' ) )
            // InternalSpringConfigDslJava.g:2309:1: ( 'value=' )
            {
            // InternalSpringConfigDslJava.g:2309:1: ( 'value=' )
            // InternalSpringConfigDslJava.g:2310:2: 'value='
            {
             before(grammarAccess.getStringListAnnotationAccess().getValueKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStringListAnnotationAccess().getValueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_1__0__Impl"


    // $ANTLR start "rule__StringListAnnotation__Group_1__1"
    // InternalSpringConfigDslJava.g:2319:1: rule__StringListAnnotation__Group_1__1 : rule__StringListAnnotation__Group_1__1__Impl rule__StringListAnnotation__Group_1__2 ;
    public final void rule__StringListAnnotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2323:1: ( rule__StringListAnnotation__Group_1__1__Impl rule__StringListAnnotation__Group_1__2 )
            // InternalSpringConfigDslJava.g:2324:2: rule__StringListAnnotation__Group_1__1__Impl rule__StringListAnnotation__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__StringListAnnotation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringListAnnotation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_1__1"


    // $ANTLR start "rule__StringListAnnotation__Group_1__1__Impl"
    // InternalSpringConfigDslJava.g:2331:1: rule__StringListAnnotation__Group_1__1__Impl : ( '{' ) ;
    public final void rule__StringListAnnotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2335:1: ( ( '{' ) )
            // InternalSpringConfigDslJava.g:2336:1: ( '{' )
            {
            // InternalSpringConfigDslJava.g:2336:1: ( '{' )
            // InternalSpringConfigDslJava.g:2337:2: '{'
            {
             before(grammarAccess.getStringListAnnotationAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStringListAnnotationAccess().getLeftCurlyBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_1__1__Impl"


    // $ANTLR start "rule__StringListAnnotation__Group_1__2"
    // InternalSpringConfigDslJava.g:2346:1: rule__StringListAnnotation__Group_1__2 : rule__StringListAnnotation__Group_1__2__Impl rule__StringListAnnotation__Group_1__3 ;
    public final void rule__StringListAnnotation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2350:1: ( rule__StringListAnnotation__Group_1__2__Impl rule__StringListAnnotation__Group_1__3 )
            // InternalSpringConfigDslJava.g:2351:2: rule__StringListAnnotation__Group_1__2__Impl rule__StringListAnnotation__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__StringListAnnotation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringListAnnotation__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_1__2"


    // $ANTLR start "rule__StringListAnnotation__Group_1__2__Impl"
    // InternalSpringConfigDslJava.g:2358:1: rule__StringListAnnotation__Group_1__2__Impl : ( ruleStringList ) ;
    public final void rule__StringListAnnotation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2362:1: ( ( ruleStringList ) )
            // InternalSpringConfigDslJava.g:2363:1: ( ruleStringList )
            {
            // InternalSpringConfigDslJava.g:2363:1: ( ruleStringList )
            // InternalSpringConfigDslJava.g:2364:2: ruleStringList
            {
             before(grammarAccess.getStringListAnnotationAccess().getStringListParserRuleCall_1_2()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListAnnotationAccess().getStringListParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_1__2__Impl"


    // $ANTLR start "rule__StringListAnnotation__Group_1__3"
    // InternalSpringConfigDslJava.g:2373:1: rule__StringListAnnotation__Group_1__3 : rule__StringListAnnotation__Group_1__3__Impl ;
    public final void rule__StringListAnnotation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2377:1: ( rule__StringListAnnotation__Group_1__3__Impl )
            // InternalSpringConfigDslJava.g:2378:2: rule__StringListAnnotation__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringListAnnotation__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_1__3"


    // $ANTLR start "rule__StringListAnnotation__Group_1__3__Impl"
    // InternalSpringConfigDslJava.g:2384:1: rule__StringListAnnotation__Group_1__3__Impl : ( '}' ) ;
    public final void rule__StringListAnnotation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2388:1: ( ( '}' ) )
            // InternalSpringConfigDslJava.g:2389:1: ( '}' )
            {
            // InternalSpringConfigDslJava.g:2389:1: ( '}' )
            // InternalSpringConfigDslJava.g:2390:2: '}'
            {
             before(grammarAccess.getStringListAnnotationAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStringListAnnotationAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListAnnotation__Group_1__3__Impl"


    // $ANTLR start "rule__StringList__Group__0"
    // InternalSpringConfigDslJava.g:2400:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2404:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // InternalSpringConfigDslJava.g:2405:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0"


    // $ANTLR start "rule__StringList__Group__0__Impl"
    // InternalSpringConfigDslJava.g:2412:1: rule__StringList__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2416:1: ( ( RULE_STRING ) )
            // InternalSpringConfigDslJava.g:2417:1: ( RULE_STRING )
            {
            // InternalSpringConfigDslJava.g:2417:1: ( RULE_STRING )
            // InternalSpringConfigDslJava.g:2418:2: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0__Impl"


    // $ANTLR start "rule__StringList__Group__1"
    // InternalSpringConfigDslJava.g:2427:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2431:1: ( rule__StringList__Group__1__Impl )
            // InternalSpringConfigDslJava.g:2432:2: rule__StringList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1"


    // $ANTLR start "rule__StringList__Group__1__Impl"
    // InternalSpringConfigDslJava.g:2438:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__Group_1__0 )* ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2442:1: ( ( ( rule__StringList__Group_1__0 )* ) )
            // InternalSpringConfigDslJava.g:2443:1: ( ( rule__StringList__Group_1__0 )* )
            {
            // InternalSpringConfigDslJava.g:2443:1: ( ( rule__StringList__Group_1__0 )* )
            // InternalSpringConfigDslJava.g:2444:2: ( rule__StringList__Group_1__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_1()); 
            // InternalSpringConfigDslJava.g:2445:2: ( rule__StringList__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpringConfigDslJava.g:2445:3: rule__StringList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__StringList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStringListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1__Impl"


    // $ANTLR start "rule__StringList__Group_1__0"
    // InternalSpringConfigDslJava.g:2454:1: rule__StringList__Group_1__0 : rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1 ;
    public final void rule__StringList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2458:1: ( rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1 )
            // InternalSpringConfigDslJava.g:2459:2: rule__StringList__Group_1__0__Impl rule__StringList__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__StringList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_1__0"


    // $ANTLR start "rule__StringList__Group_1__0__Impl"
    // InternalSpringConfigDslJava.g:2466:1: rule__StringList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2470:1: ( ( ',' ) )
            // InternalSpringConfigDslJava.g:2471:1: ( ',' )
            {
            // InternalSpringConfigDslJava.g:2471:1: ( ',' )
            // InternalSpringConfigDslJava.g:2472:2: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_1__0__Impl"


    // $ANTLR start "rule__StringList__Group_1__1"
    // InternalSpringConfigDslJava.g:2481:1: rule__StringList__Group_1__1 : rule__StringList__Group_1__1__Impl ;
    public final void rule__StringList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2485:1: ( rule__StringList__Group_1__1__Impl )
            // InternalSpringConfigDslJava.g:2486:2: rule__StringList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_1__1"


    // $ANTLR start "rule__StringList__Group_1__1__Impl"
    // InternalSpringConfigDslJava.g:2492:1: rule__StringList__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__StringList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2496:1: ( ( RULE_STRING ) )
            // InternalSpringConfigDslJava.g:2497:1: ( RULE_STRING )
            {
            // InternalSpringConfigDslJava.g:2497:1: ( RULE_STRING )
            // InternalSpringConfigDslJava.g:2498:2: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getSTRINGTerminalRuleCall_1_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getSTRINGTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_1__1__Impl"


    // $ANTLR start "rule__ClassFileExtensions__Group__0"
    // InternalSpringConfigDslJava.g:2508:1: rule__ClassFileExtensions__Group__0 : rule__ClassFileExtensions__Group__0__Impl rule__ClassFileExtensions__Group__1 ;
    public final void rule__ClassFileExtensions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2512:1: ( rule__ClassFileExtensions__Group__0__Impl rule__ClassFileExtensions__Group__1 )
            // InternalSpringConfigDslJava.g:2513:2: rule__ClassFileExtensions__Group__0__Impl rule__ClassFileExtensions__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ClassFileExtensions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFileExtensions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtensions__Group__0"


    // $ANTLR start "rule__ClassFileExtensions__Group__0__Impl"
    // InternalSpringConfigDslJava.g:2520:1: rule__ClassFileExtensions__Group__0__Impl : ( ruleClassFileExtension ) ;
    public final void rule__ClassFileExtensions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2524:1: ( ( ruleClassFileExtension ) )
            // InternalSpringConfigDslJava.g:2525:1: ( ruleClassFileExtension )
            {
            // InternalSpringConfigDslJava.g:2525:1: ( ruleClassFileExtension )
            // InternalSpringConfigDslJava.g:2526:2: ruleClassFileExtension
            {
             before(grammarAccess.getClassFileExtensionsAccess().getClassFileExtensionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleClassFileExtension();

            state._fsp--;

             after(grammarAccess.getClassFileExtensionsAccess().getClassFileExtensionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtensions__Group__0__Impl"


    // $ANTLR start "rule__ClassFileExtensions__Group__1"
    // InternalSpringConfigDslJava.g:2535:1: rule__ClassFileExtensions__Group__1 : rule__ClassFileExtensions__Group__1__Impl ;
    public final void rule__ClassFileExtensions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2539:1: ( rule__ClassFileExtensions__Group__1__Impl )
            // InternalSpringConfigDslJava.g:2540:2: rule__ClassFileExtensions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFileExtensions__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtensions__Group__1"


    // $ANTLR start "rule__ClassFileExtensions__Group__1__Impl"
    // InternalSpringConfigDslJava.g:2546:1: rule__ClassFileExtensions__Group__1__Impl : ( ( rule__ClassFileExtensions__Group_1__0 )* ) ;
    public final void rule__ClassFileExtensions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2550:1: ( ( ( rule__ClassFileExtensions__Group_1__0 )* ) )
            // InternalSpringConfigDslJava.g:2551:1: ( ( rule__ClassFileExtensions__Group_1__0 )* )
            {
            // InternalSpringConfigDslJava.g:2551:1: ( ( rule__ClassFileExtensions__Group_1__0 )* )
            // InternalSpringConfigDslJava.g:2552:2: ( rule__ClassFileExtensions__Group_1__0 )*
            {
             before(grammarAccess.getClassFileExtensionsAccess().getGroup_1()); 
            // InternalSpringConfigDslJava.g:2553:2: ( rule__ClassFileExtensions__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSpringConfigDslJava.g:2553:3: rule__ClassFileExtensions__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ClassFileExtensions__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassFileExtensionsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtensions__Group__1__Impl"


    // $ANTLR start "rule__ClassFileExtensions__Group_1__0"
    // InternalSpringConfigDslJava.g:2562:1: rule__ClassFileExtensions__Group_1__0 : rule__ClassFileExtensions__Group_1__0__Impl rule__ClassFileExtensions__Group_1__1 ;
    public final void rule__ClassFileExtensions__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2566:1: ( rule__ClassFileExtensions__Group_1__0__Impl rule__ClassFileExtensions__Group_1__1 )
            // InternalSpringConfigDslJava.g:2567:2: rule__ClassFileExtensions__Group_1__0__Impl rule__ClassFileExtensions__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassFileExtensions__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFileExtensions__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtensions__Group_1__0"


    // $ANTLR start "rule__ClassFileExtensions__Group_1__0__Impl"
    // InternalSpringConfigDslJava.g:2574:1: rule__ClassFileExtensions__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ClassFileExtensions__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2578:1: ( ( ',' ) )
            // InternalSpringConfigDslJava.g:2579:1: ( ',' )
            {
            // InternalSpringConfigDslJava.g:2579:1: ( ',' )
            // InternalSpringConfigDslJava.g:2580:2: ','
            {
             before(grammarAccess.getClassFileExtensionsAccess().getCommaKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClassFileExtensionsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtensions__Group_1__0__Impl"


    // $ANTLR start "rule__ClassFileExtensions__Group_1__1"
    // InternalSpringConfigDslJava.g:2589:1: rule__ClassFileExtensions__Group_1__1 : rule__ClassFileExtensions__Group_1__1__Impl ;
    public final void rule__ClassFileExtensions__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2593:1: ( rule__ClassFileExtensions__Group_1__1__Impl )
            // InternalSpringConfigDslJava.g:2594:2: rule__ClassFileExtensions__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFileExtensions__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtensions__Group_1__1"


    // $ANTLR start "rule__ClassFileExtensions__Group_1__1__Impl"
    // InternalSpringConfigDslJava.g:2600:1: rule__ClassFileExtensions__Group_1__1__Impl : ( ruleClassFileExtension ) ;
    public final void rule__ClassFileExtensions__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2604:1: ( ( ruleClassFileExtension ) )
            // InternalSpringConfigDslJava.g:2605:1: ( ruleClassFileExtension )
            {
            // InternalSpringConfigDslJava.g:2605:1: ( ruleClassFileExtension )
            // InternalSpringConfigDslJava.g:2606:2: ruleClassFileExtension
            {
             before(grammarAccess.getClassFileExtensionsAccess().getClassFileExtensionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleClassFileExtension();

            state._fsp--;

             after(grammarAccess.getClassFileExtensionsAccess().getClassFileExtensionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtensions__Group_1__1__Impl"


    // $ANTLR start "rule__ClassFileExtension__Group__0"
    // InternalSpringConfigDslJava.g:2616:1: rule__ClassFileExtension__Group__0 : rule__ClassFileExtension__Group__0__Impl rule__ClassFileExtension__Group__1 ;
    public final void rule__ClassFileExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2620:1: ( rule__ClassFileExtension__Group__0__Impl rule__ClassFileExtension__Group__1 )
            // InternalSpringConfigDslJava.g:2621:2: rule__ClassFileExtension__Group__0__Impl rule__ClassFileExtension__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ClassFileExtension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassFileExtension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtension__Group__0"


    // $ANTLR start "rule__ClassFileExtension__Group__0__Impl"
    // InternalSpringConfigDslJava.g:2628:1: rule__ClassFileExtension__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ClassFileExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2632:1: ( ( RULE_ID ) )
            // InternalSpringConfigDslJava.g:2633:1: ( RULE_ID )
            {
            // InternalSpringConfigDslJava.g:2633:1: ( RULE_ID )
            // InternalSpringConfigDslJava.g:2634:2: RULE_ID
            {
             before(grammarAccess.getClassFileExtensionAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassFileExtensionAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtension__Group__0__Impl"


    // $ANTLR start "rule__ClassFileExtension__Group__1"
    // InternalSpringConfigDslJava.g:2643:1: rule__ClassFileExtension__Group__1 : rule__ClassFileExtension__Group__1__Impl ;
    public final void rule__ClassFileExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2647:1: ( rule__ClassFileExtension__Group__1__Impl )
            // InternalSpringConfigDslJava.g:2648:2: rule__ClassFileExtension__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassFileExtension__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtension__Group__1"


    // $ANTLR start "rule__ClassFileExtension__Group__1__Impl"
    // InternalSpringConfigDslJava.g:2654:1: rule__ClassFileExtension__Group__1__Impl : ( '.class' ) ;
    public final void rule__ClassFileExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2658:1: ( ( '.class' ) )
            // InternalSpringConfigDslJava.g:2659:1: ( '.class' )
            {
            // InternalSpringConfigDslJava.g:2659:1: ( '.class' )
            // InternalSpringConfigDslJava.g:2660:2: '.class'
            {
             before(grammarAccess.getClassFileExtensionAccess().getClassKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassFileExtensionAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassFileExtension__Group__1__Impl"


    // $ANTLR start "rule__Component__UnorderedGroup_1"
    // InternalSpringConfigDslJava.g:2670:1: rule__Component__UnorderedGroup_1 : rule__Component__UnorderedGroup_1__0 {...}?;
    public final void rule__Component__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getComponentAccess().getUnorderedGroup_1());
        	
        try {
            // InternalSpringConfigDslJava.g:2675:1: ( rule__Component__UnorderedGroup_1__0 {...}?)
            // InternalSpringConfigDslJava.g:2676:2: rule__Component__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Component__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__Component__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getComponentAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__UnorderedGroup_1"


    // $ANTLR start "rule__Component__UnorderedGroup_1__Impl"
    // InternalSpringConfigDslJava.g:2684:1: rule__Component__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( '@Bean' ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_4__0 ) ) ) ) ) ;
    public final void rule__Component__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSpringConfigDslJava.g:2689:1: ( ( ({...}? => ( ( ( '@Bean' ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_4__0 ) ) ) ) ) )
            // InternalSpringConfigDslJava.g:2690:3: ( ({...}? => ( ( ( '@Bean' ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_4__0 ) ) ) ) )
            {
            // InternalSpringConfigDslJava.g:2690:3: ( ({...}? => ( ( ( '@Bean' ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Component__Group_1_4__0 ) ) ) ) )
            int alt13=5;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) ) {
                int LA13_2 = input.LA(2);

                if ( LA13_2 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) ) {
                    int LA13_5 = input.LA(3);

                    if ( LA13_5 == 19 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) ) {
                        int LA13_7 = input.LA(4);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) ) {
                            alt13=2;
                        }
                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) {
                            alt13=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;
                    }
                }
                else if ( ( LA13_2 == 16 || LA13_2 == 27 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 3) ) {
                alt13=4;
            }
            else if ( ( LA13_0 == RULE_ID || LA13_0 >= 12 && LA13_0 <= 14 || LA13_0 == 23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 4) ) {
                alt13=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpringConfigDslJava.g:2691:3: ({...}? => ( ( ( '@Bean' ) ) ) )
                    {
                    // InternalSpringConfigDslJava.g:2691:3: ({...}? => ( ( ( '@Bean' ) ) ) )
                    // InternalSpringConfigDslJava.g:2692:4: {...}? => ( ( ( '@Bean' ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Component__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalSpringConfigDslJava.g:2692:105: ( ( ( '@Bean' ) ) )
                    // InternalSpringConfigDslJava.g:2693:5: ( ( '@Bean' ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalSpringConfigDslJava.g:2699:5: ( ( '@Bean' ) )
                    // InternalSpringConfigDslJava.g:2700:6: ( '@Bean' )
                    {
                     before(grammarAccess.getComponentAccess().getBeanKeyword_1_0()); 
                    // InternalSpringConfigDslJava.g:2701:6: ( '@Bean' )
                    // InternalSpringConfigDslJava.g:2701:7: '@Bean'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentAccess().getBeanKeyword_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpringConfigDslJava.g:2706:3: ({...}? => ( ( ( rule__Component__Group_1_1__0 ) ) ) )
                    {
                    // InternalSpringConfigDslJava.g:2706:3: ({...}? => ( ( ( rule__Component__Group_1_1__0 ) ) ) )
                    // InternalSpringConfigDslJava.g:2707:4: {...}? => ( ( ( rule__Component__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Component__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalSpringConfigDslJava.g:2707:105: ( ( ( rule__Component__Group_1_1__0 ) ) )
                    // InternalSpringConfigDslJava.g:2708:5: ( ( rule__Component__Group_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalSpringConfigDslJava.g:2714:5: ( ( rule__Component__Group_1_1__0 ) )
                    // InternalSpringConfigDslJava.g:2715:6: ( rule__Component__Group_1_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_1()); 
                    // InternalSpringConfigDslJava.g:2716:6: ( rule__Component__Group_1_1__0 )
                    // InternalSpringConfigDslJava.g:2716:7: rule__Component__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpringConfigDslJava.g:2721:3: ({...}? => ( ( ( rule__Component__Group_1_2__0 ) ) ) )
                    {
                    // InternalSpringConfigDslJava.g:2721:3: ({...}? => ( ( ( rule__Component__Group_1_2__0 ) ) ) )
                    // InternalSpringConfigDslJava.g:2722:4: {...}? => ( ( ( rule__Component__Group_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Component__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalSpringConfigDslJava.g:2722:105: ( ( ( rule__Component__Group_1_2__0 ) ) )
                    // InternalSpringConfigDslJava.g:2723:5: ( ( rule__Component__Group_1_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalSpringConfigDslJava.g:2729:5: ( ( rule__Component__Group_1_2__0 ) )
                    // InternalSpringConfigDslJava.g:2730:6: ( rule__Component__Group_1_2__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_2()); 
                    // InternalSpringConfigDslJava.g:2731:6: ( rule__Component__Group_1_2__0 )
                    // InternalSpringConfigDslJava.g:2731:7: rule__Component__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_1_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSpringConfigDslJava.g:2736:3: ({...}? => ( ( ( rule__Component__Group_1_3__0 ) ) ) )
                    {
                    // InternalSpringConfigDslJava.g:2736:3: ({...}? => ( ( ( rule__Component__Group_1_3__0 ) ) ) )
                    // InternalSpringConfigDslJava.g:2737:4: {...}? => ( ( ( rule__Component__Group_1_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Component__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 3)");
                    }
                    // InternalSpringConfigDslJava.g:2737:105: ( ( ( rule__Component__Group_1_3__0 ) ) )
                    // InternalSpringConfigDslJava.g:2738:5: ( ( rule__Component__Group_1_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 3);
                    				

                    					selected = true;
                    				
                    // InternalSpringConfigDslJava.g:2744:5: ( ( rule__Component__Group_1_3__0 ) )
                    // InternalSpringConfigDslJava.g:2745:6: ( rule__Component__Group_1_3__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_3()); 
                    // InternalSpringConfigDslJava.g:2746:6: ( rule__Component__Group_1_3__0 )
                    // InternalSpringConfigDslJava.g:2746:7: rule__Component__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_1_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSpringConfigDslJava.g:2751:3: ({...}? => ( ( ( rule__Component__Group_1_4__0 ) ) ) )
                    {
                    // InternalSpringConfigDslJava.g:2751:3: ({...}? => ( ( ( rule__Component__Group_1_4__0 ) ) ) )
                    // InternalSpringConfigDslJava.g:2752:4: {...}? => ( ( ( rule__Component__Group_1_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Component__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 4)");
                    }
                    // InternalSpringConfigDslJava.g:2752:105: ( ( ( rule__Component__Group_1_4__0 ) ) )
                    // InternalSpringConfigDslJava.g:2753:5: ( ( rule__Component__Group_1_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 4);
                    				

                    					selected = true;
                    				
                    // InternalSpringConfigDslJava.g:2759:5: ( ( rule__Component__Group_1_4__0 ) )
                    // InternalSpringConfigDslJava.g:2760:6: ( rule__Component__Group_1_4__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_4()); 
                    // InternalSpringConfigDslJava.g:2761:6: ( rule__Component__Group_1_4__0 )
                    // InternalSpringConfigDslJava.g:2761:7: rule__Component__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_1_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Component__UnorderedGroup_1__0"
    // InternalSpringConfigDslJava.g:2774:1: rule__Component__UnorderedGroup_1__0 : rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__1 )? ;
    public final void rule__Component__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2778:1: ( rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__1 )? )
            // InternalSpringConfigDslJava.g:2779:2: rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_22);
            rule__Component__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalSpringConfigDslJava.g:2780:2: ( rule__Component__UnorderedGroup_1__1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) ) {
                alt14=1;
            }
            else if ( LA14_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 3) ) {
                alt14=1;
            }
            else if ( ( LA14_0 == RULE_ID || LA14_0 >= 12 && LA14_0 <= 14 || LA14_0 == 23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 4) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpringConfigDslJava.g:2780:2: rule__Component__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__UnorderedGroup_1__0"


    // $ANTLR start "rule__Component__UnorderedGroup_1__1"
    // InternalSpringConfigDslJava.g:2786:1: rule__Component__UnorderedGroup_1__1 : rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__2 )? ;
    public final void rule__Component__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2790:1: ( rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__2 )? )
            // InternalSpringConfigDslJava.g:2791:2: rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_22);
            rule__Component__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalSpringConfigDslJava.g:2792:2: ( rule__Component__UnorderedGroup_1__2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) ) {
                alt15=1;
            }
            else if ( LA15_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 3) ) {
                alt15=1;
            }
            else if ( ( LA15_0 == RULE_ID || LA15_0 >= 12 && LA15_0 <= 14 || LA15_0 == 23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 4) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpringConfigDslJava.g:2792:2: rule__Component__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__UnorderedGroup_1__1"


    // $ANTLR start "rule__Component__UnorderedGroup_1__2"
    // InternalSpringConfigDslJava.g:2798:1: rule__Component__UnorderedGroup_1__2 : rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__3 )? ;
    public final void rule__Component__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2802:1: ( rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__3 )? )
            // InternalSpringConfigDslJava.g:2803:2: rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_22);
            rule__Component__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalSpringConfigDslJava.g:2804:2: ( rule__Component__UnorderedGroup_1__3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) ) {
                alt16=1;
            }
            else if ( LA16_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 3) ) {
                alt16=1;
            }
            else if ( ( LA16_0 == RULE_ID || LA16_0 >= 12 && LA16_0 <= 14 || LA16_0 == 23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 4) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpringConfigDslJava.g:2804:2: rule__Component__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__UnorderedGroup_1__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__UnorderedGroup_1__2"


    // $ANTLR start "rule__Component__UnorderedGroup_1__3"
    // InternalSpringConfigDslJava.g:2810:1: rule__Component__UnorderedGroup_1__3 : rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__4 )? ;
    public final void rule__Component__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2814:1: ( rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__4 )? )
            // InternalSpringConfigDslJava.g:2815:2: rule__Component__UnorderedGroup_1__Impl ( rule__Component__UnorderedGroup_1__4 )?
            {
            pushFollow(FOLLOW_22);
            rule__Component__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalSpringConfigDslJava.g:2816:2: ( rule__Component__UnorderedGroup_1__4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 2) ) ) {
                alt17=1;
            }
            else if ( LA17_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 3) ) {
                alt17=1;
            }
            else if ( ( LA17_0 == RULE_ID || LA17_0 >= 12 && LA17_0 <= 14 || LA17_0 == 23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 4) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpringConfigDslJava.g:2816:2: rule__Component__UnorderedGroup_1__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__UnorderedGroup_1__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__UnorderedGroup_1__3"


    // $ANTLR start "rule__Component__UnorderedGroup_1__4"
    // InternalSpringConfigDslJava.g:2822:1: rule__Component__UnorderedGroup_1__4 : rule__Component__UnorderedGroup_1__Impl ;
    public final void rule__Component__UnorderedGroup_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2826:1: ( rule__Component__UnorderedGroup_1__Impl )
            // InternalSpringConfigDslJava.g:2827:2: rule__Component__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__UnorderedGroup_1__4"


    // $ANTLR start "rule__SpringProject__ConfigurationsAssignment_1"
    // InternalSpringConfigDslJava.g:2834:1: rule__SpringProject__ConfigurationsAssignment_1 : ( ruleConfiguration ) ;
    public final void rule__SpringProject__ConfigurationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2838:1: ( ( ruleConfiguration ) )
            // InternalSpringConfigDslJava.g:2839:2: ( ruleConfiguration )
            {
            // InternalSpringConfigDslJava.g:2839:2: ( ruleConfiguration )
            // InternalSpringConfigDslJava.g:2840:3: ruleConfiguration
            {
             before(grammarAccess.getSpringProjectAccess().getConfigurationsConfigurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getSpringProjectAccess().getConfigurationsConfigurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpringProject__ConfigurationsAssignment_1"


    // $ANTLR start "rule__Configuration__AnnotationConfigurationAssignment_1"
    // InternalSpringConfigDslJava.g:2849:1: rule__Configuration__AnnotationConfigurationAssignment_1 : ( ruleAnnotationConfiguration ) ;
    public final void rule__Configuration__AnnotationConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2853:1: ( ( ruleAnnotationConfiguration ) )
            // InternalSpringConfigDslJava.g:2854:2: ( ruleAnnotationConfiguration )
            {
            // InternalSpringConfigDslJava.g:2854:2: ( ruleAnnotationConfiguration )
            // InternalSpringConfigDslJava.g:2855:3: ruleAnnotationConfiguration
            {
             before(grammarAccess.getConfigurationAccess().getAnnotationConfigurationAnnotationConfigurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotationConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getAnnotationConfigurationAnnotationConfigurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__AnnotationConfigurationAssignment_1"


    // $ANTLR start "rule__Configuration__ClassVisibilityAssignment_2"
    // InternalSpringConfigDslJava.g:2864:1: rule__Configuration__ClassVisibilityAssignment_2 : ( ruleVisibility ) ;
    public final void rule__Configuration__ClassVisibilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2868:1: ( ( ruleVisibility ) )
            // InternalSpringConfigDslJava.g:2869:2: ( ruleVisibility )
            {
            // InternalSpringConfigDslJava.g:2869:2: ( ruleVisibility )
            // InternalSpringConfigDslJava.g:2870:3: ruleVisibility
            {
             before(grammarAccess.getConfigurationAccess().getClassVisibilityVisibilityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getClassVisibilityVisibilityEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ClassVisibilityAssignment_2"


    // $ANTLR start "rule__Configuration__ComponentsAssignment_6"
    // InternalSpringConfigDslJava.g:2879:1: rule__Configuration__ComponentsAssignment_6 : ( ruleComponent ) ;
    public final void rule__Configuration__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2883:1: ( ( ruleComponent ) )
            // InternalSpringConfigDslJava.g:2884:2: ( ruleComponent )
            {
            // InternalSpringConfigDslJava.g:2884:2: ( ruleComponent )
            // InternalSpringConfigDslJava.g:2885:3: ruleComponent
            {
             before(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ComponentsAssignment_6"


    // $ANTLR start "rule__Component__NamesAssignment_1_1_1"
    // InternalSpringConfigDslJava.g:2894:1: rule__Component__NamesAssignment_1_1_1 : ( ( rule__Component__NamesAlternatives_1_1_1_0 ) ) ;
    public final void rule__Component__NamesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2898:1: ( ( ( rule__Component__NamesAlternatives_1_1_1_0 ) ) )
            // InternalSpringConfigDslJava.g:2899:2: ( ( rule__Component__NamesAlternatives_1_1_1_0 ) )
            {
            // InternalSpringConfigDslJava.g:2899:2: ( ( rule__Component__NamesAlternatives_1_1_1_0 ) )
            // InternalSpringConfigDslJava.g:2900:3: ( rule__Component__NamesAlternatives_1_1_1_0 )
            {
             before(grammarAccess.getComponentAccess().getNamesAlternatives_1_1_1_0()); 
            // InternalSpringConfigDslJava.g:2901:3: ( rule__Component__NamesAlternatives_1_1_1_0 )
            // InternalSpringConfigDslJava.g:2901:4: rule__Component__NamesAlternatives_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__NamesAlternatives_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNamesAlternatives_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NamesAssignment_1_1_1"


    // $ANTLR start "rule__Component__NameAssignment_1_2_1"
    // InternalSpringConfigDslJava.g:2909:1: rule__Component__NameAssignment_1_2_1 : ( RULE_STRING ) ;
    public final void rule__Component__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2913:1: ( ( RULE_STRING ) )
            // InternalSpringConfigDslJava.g:2914:2: ( RULE_STRING )
            {
            // InternalSpringConfigDslJava.g:2914:2: ( RULE_STRING )
            // InternalSpringConfigDslJava.g:2915:3: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1_2_1"


    // $ANTLR start "rule__Component__DependsOnAssignment_1_3_2"
    // InternalSpringConfigDslJava.g:2924:1: rule__Component__DependsOnAssignment_1_3_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Component__DependsOnAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2928:1: ( ( ( RULE_STRING ) ) )
            // InternalSpringConfigDslJava.g:2929:2: ( ( RULE_STRING ) )
            {
            // InternalSpringConfigDslJava.g:2929:2: ( ( RULE_STRING ) )
            // InternalSpringConfigDslJava.g:2930:3: ( RULE_STRING )
            {
             before(grammarAccess.getComponentAccess().getDependsOnComponentCrossReference_1_3_2_0()); 
            // InternalSpringConfigDslJava.g:2931:3: ( RULE_STRING )
            // InternalSpringConfigDslJava.g:2932:4: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getDependsOnComponentSTRINGTerminalRuleCall_1_3_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getDependsOnComponentSTRINGTerminalRuleCall_1_3_2_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getDependsOnComponentCrossReference_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__DependsOnAssignment_1_3_2"


    // $ANTLR start "rule__Component__QualifierAssignment_1_4_0_2"
    // InternalSpringConfigDslJava.g:2943:1: rule__Component__QualifierAssignment_1_4_0_2 : ( RULE_STRING ) ;
    public final void rule__Component__QualifierAssignment_1_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2947:1: ( ( RULE_STRING ) )
            // InternalSpringConfigDslJava.g:2948:2: ( RULE_STRING )
            {
            // InternalSpringConfigDslJava.g:2948:2: ( RULE_STRING )
            // InternalSpringConfigDslJava.g:2949:3: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getQualifierSTRINGTerminalRuleCall_1_4_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getQualifierSTRINGTerminalRuleCall_1_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__QualifierAssignment_1_4_0_2"


    // $ANTLR start "rule__Component__ConstructorVisibilityAssignment_1_4_1"
    // InternalSpringConfigDslJava.g:2958:1: rule__Component__ConstructorVisibilityAssignment_1_4_1 : ( ruleVisibility ) ;
    public final void rule__Component__ConstructorVisibilityAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2962:1: ( ( ruleVisibility ) )
            // InternalSpringConfigDslJava.g:2963:2: ( ruleVisibility )
            {
            // InternalSpringConfigDslJava.g:2963:2: ( ruleVisibility )
            // InternalSpringConfigDslJava.g:2964:3: ruleVisibility
            {
             before(grammarAccess.getComponentAccess().getConstructorVisibilityVisibilityEnumRuleCall_1_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getConstructorVisibilityVisibilityEnumRuleCall_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ConstructorVisibilityAssignment_1_4_1"


    // $ANTLR start "rule__Component__ClassAssignment_1_4_2"
    // InternalSpringConfigDslJava.g:2973:1: rule__Component__ClassAssignment_1_4_2 : ( ruleCreationMethod ) ;
    public final void rule__Component__ClassAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2977:1: ( ( ruleCreationMethod ) )
            // InternalSpringConfigDslJava.g:2978:2: ( ruleCreationMethod )
            {
            // InternalSpringConfigDslJava.g:2978:2: ( ruleCreationMethod )
            // InternalSpringConfigDslJava.g:2979:3: ruleCreationMethod
            {
             before(grammarAccess.getComponentAccess().getClassCreationMethodParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCreationMethod();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getClassCreationMethodParserRuleCall_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ClassAssignment_1_4_2"


    // $ANTLR start "rule__Component__NameAssignment_1_4_3"
    // InternalSpringConfigDslJava.g:2988:1: rule__Component__NameAssignment_1_4_3 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:2992:1: ( ( RULE_ID ) )
            // InternalSpringConfigDslJava.g:2993:2: ( RULE_ID )
            {
            // InternalSpringConfigDslJava.g:2993:2: ( RULE_ID )
            // InternalSpringConfigDslJava.g:2994:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_4_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1_4_3"


    // $ANTLR start "rule__Component__ClassAssignment_1_4_9"
    // InternalSpringConfigDslJava.g:3003:1: rule__Component__ClassAssignment_1_4_9 : ( ruleCreationMethod ) ;
    public final void rule__Component__ClassAssignment_1_4_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:3007:1: ( ( ruleCreationMethod ) )
            // InternalSpringConfigDslJava.g:3008:2: ( ruleCreationMethod )
            {
            // InternalSpringConfigDslJava.g:3008:2: ( ruleCreationMethod )
            // InternalSpringConfigDslJava.g:3009:3: ruleCreationMethod
            {
             before(grammarAccess.getComponentAccess().getClassCreationMethodParserRuleCall_1_4_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCreationMethod();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getClassCreationMethodParserRuleCall_1_4_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ClassAssignment_1_4_9"


    // $ANTLR start "rule__CreationMethod__ClassAssignment"
    // InternalSpringConfigDslJava.g:3018:1: rule__CreationMethod__ClassAssignment : ( ruleClass ) ;
    public final void rule__CreationMethod__ClassAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:3022:1: ( ( ruleClass ) )
            // InternalSpringConfigDslJava.g:3023:2: ( ruleClass )
            {
            // InternalSpringConfigDslJava.g:3023:2: ( ruleClass )
            // InternalSpringConfigDslJava.g:3024:3: ruleClass
            {
             before(grammarAccess.getCreationMethodAccess().getClassClassParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCreationMethodAccess().getClassClassParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationMethod__ClassAssignment"


    // $ANTLR start "rule__Class__ClassnameAssignment"
    // InternalSpringConfigDslJava.g:3033:1: rule__Class__ClassnameAssignment : ( RULE_ID ) ;
    public final void rule__Class__ClassnameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:3037:1: ( ( RULE_ID ) )
            // InternalSpringConfigDslJava.g:3038:2: ( RULE_ID )
            {
            // InternalSpringConfigDslJava.g:3038:2: ( RULE_ID )
            // InternalSpringConfigDslJava.g:3039:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getClassnameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassnameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ClassnameAssignment"


    // $ANTLR start "rule__AnnotationConfiguration__AnnotationsAssignment_1_1"
    // InternalSpringConfigDslJava.g:3048:1: rule__AnnotationConfiguration__AnnotationsAssignment_1_1 : ( ruleImportAnnotations ) ;
    public final void rule__AnnotationConfiguration__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringConfigDslJava.g:3052:1: ( ( ruleImportAnnotations ) )
            // InternalSpringConfigDslJava.g:3053:2: ( ruleImportAnnotations )
            {
            // InternalSpringConfigDslJava.g:3053:2: ( ruleImportAnnotations )
            // InternalSpringConfigDslJava.g:3054:3: ruleImportAnnotations
            {
             before(grammarAccess.getAnnotationConfigurationAccess().getAnnotationsImportAnnotationsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportAnnotations();

            state._fsp--;

             after(grammarAccess.getAnnotationConfigurationAccess().getAnnotationsImportAnnotationsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationConfiguration__AnnotationsAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040947020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008010030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040947022L});

}
