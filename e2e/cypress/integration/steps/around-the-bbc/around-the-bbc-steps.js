import {Given, Then, When} from 'cypress-cucumber-preprocessor/steps';

Given(/^test I visit (.*)$/, (url) => {
    cy.visit(url);
});

Given(/test I set the view to (.*)$/, (view) => {
    cy.viewport(1280, 720);
});

When(/^test I scroll to the footer$/, () => {
    cy.get('footer').scrollIntoView();
});

Then(/^test check the around the bbc section is present$/, () => {
    return cy.get('.around-the-bbc-swimlane').should('be.visible');
});

When(/^I check link (.*) on the around the bbc module works correctly$/, (linkNumber) => {
    cy.get('.swimlane__items').children().eq(linkNumber - 1).click({force : true});
});
