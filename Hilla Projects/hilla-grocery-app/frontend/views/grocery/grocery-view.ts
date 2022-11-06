import { html } from 'lit';
import { customElement, state } from 'lit/decorators.js';
import { View } from '../../views/view';
import "@vaadin/grid";
import "@vaadin/text-field";
import "@vaadin/button";
import "@vaadin/number-field";

@customElement('grocery-view')
export class GroceryView extends View {
  @state() groceryItems : GroceryItem[]=[];
  render() {
    return html`<div>
      <vaadin-text-field label="item"></vaadin-text-field>
      <vaadin-number-field label="quantity"></vaadin-number-field>
      <vaadin-button theme="primary">Add</vaadin-button>
      <vaadin-grid></vaadin-grid>
   
    </div>`;
  }

  connectedCallback() {
    super.connectedCallback();
    this.classList.add(
      'flex',
      'flex-col',
      'h-full',
      'p-l'
    );
  }
}
